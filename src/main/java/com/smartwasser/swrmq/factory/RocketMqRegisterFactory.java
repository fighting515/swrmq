package com.smartwasser.swrmq.factory;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.MessageQueueListener;
import com.alibaba.rocketmq.client.consumer.PullResult;
import com.alibaba.rocketmq.client.consumer.PullStatus;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.message.MessageQueue;
import com.smartwasser.swrmq.consumer.BasePullConsumer;
import com.smartwasser.swrmq.consumer.BasePushConsumer;

/**
 * 
 * <p>RocketMqRegisterFactory</p>
 * <p>@description: rocketmq's factory,It's used for register consumer and producer</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月15日 下午5:50:11</p>
 */
public class RocketMqRegisterFactory {
	
	private static final Logger logger = LoggerFactory.getLogger(RocketMqRegisterFactory.class);
	
	private RocketMqConfigFactory rocketMqConfigFactory;
	
	/**
	 * 将所有消费注册到容器中
	 */
	public RocketMqRegisterFactory(RocketMqConfigFactory rocketMqConfigFactory){
		this.rocketMqConfigFactory = rocketMqConfigFactory;
		for (Iterator<BasePullConsumer> iterator = rocketMqConfigFactory.getPullConsumers().iterator(); iterator.hasNext();) {
			BasePullConsumer basePullConsumer = (BasePullConsumer) iterator.next();
			registPullConsumer(basePullConsumer);
		}
		for (Iterator<BasePushConsumer> iterator = rocketMqConfigFactory.getPushConsumers().iterator(); iterator.hasNext();) {
			BasePushConsumer basePushConsumer = (BasePushConsumer) iterator.next();
			registPushConsumer(basePushConsumer);
		}
	}
	
	/**
	 * 注册pull型消费者
	 * @param basePullConsumer
	 * @return
	 */
	private boolean registPullConsumer(final BasePullConsumer basePullConsumer){
		if(basePullConsumer != null){
			final DefaultMQPullConsumer pullConsumer = new DefaultMQPullConsumer(basePullConsumer.getTopic());
			pullConsumer.setConsumerGroup(basePullConsumer.getTopicGroup());
			pullConsumer.setNamesrvAddr(basePullConsumer.getNameserverAddress());
			pullConsumer.setInstanceName(basePullConsumer.getInstanceName());
			pullConsumer.setClientIP(rocketMqConfigFactory.getLocalIp());
			pullConsumer.setMessageModel(basePullConsumer.getMessageModel());
			
			//注册监听，拉取队列中的消息，该监听只会在初始化时执行一次
			pullConsumer.registerMessageQueueListener(basePullConsumer.getTopic(), new MessageQueueListener() {
				
				public void messageQueueChanged(String topic, Set<MessageQueue> mqAll, Set<MessageQueue> mqDivided) {
					
					for (Iterator<MessageQueue> iterator = mqAll.iterator(); iterator.hasNext();) {
						MessageQueue messageQueue = (MessageQueue) iterator.next();
						try {
							long offset = pullConsumer.fetchConsumeOffset(messageQueue, false);
							if(offset > -1){
								PullResult result = pullConsumer.pullBlockIfNotFound(messageQueue, basePullConsumer.getSubExpression(), offset, 32);
								PullStatus status = result.getPullStatus();
								switch (status) {
								case FOUND:
									List<MessageExt> mes = result.getMsgFoundList();
									if(mes != null && mes.size() > 0){
										for (Iterator<MessageExt> iterator2 = mes.iterator(); iterator2.hasNext();) {
											MessageExt messageExt = (MessageExt) iterator2.next();
											
											boolean flag = basePullConsumer.getMessageHandler().handler(messageExt);
											if(!flag){
												logger.error("消费此消息失败："+messageExt);
											}
										}
									}
									break;
								case NO_MATCHED_MSG:
									logger.info("无匹配的消息");
									break;
								case NO_NEW_MSG:
									logger.info("没有新的消息");
									break;
								case OFFSET_ILLEGAL:
									logger.info("消费进度值异常");
									break;
								default:
									break;
								}
							}else{
								logger.info("消息队列 "+messageQueue.getTopic()+" - "+messageQueue.getQueueId()+" 的消费进度为"+offset);
							}
						} catch (Exception e) {
							logger.error("拉去消息队列操作异常",e);
						}
					}
				}
			});
			
			try {
				pullConsumer.start();
			} catch (MQClientException e) {
				logger.error("启动pullConsumer失败",e);
				return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 注册push型消费者
	 * @param basePushConsumer
	 * @return
	 * @throws MQClientException
	 */
	private boolean registPushConsumer(final BasePushConsumer basePushConsumer){
		
		DefaultMQPushConsumer pushConsumer = new DefaultMQPushConsumer();
		pushConsumer.setNamesrvAddr(basePushConsumer.getNameserverAddress());
		pushConsumer.setInstanceName(basePushConsumer.getInstanceName());
		pushConsumer.setClientIP(rocketMqConfigFactory.getLocalIp());
		pushConsumer.setConsumerGroup(basePushConsumer.getTopicGroup());
		Map<String, String> topicMap = basePushConsumer.getTopicMap();
                 		if(topicMap.size() > 0){
			Set<Entry<String, String>> set = topicMap.entrySet();
			for (Iterator<Entry<String, String>> iterator = set.iterator(); iterator.hasNext();) {
				Entry<String, String> entry = (Entry<String, String>) iterator.next();
				try {
					pushConsumer.subscribe(entry.getKey(), entry.getValue());
				} catch (MQClientException e) {
					logger.error("订阅异常",e);
					return false;
				}
			}
		}
		pushConsumer.setMessageModel(basePushConsumer.getMessageModel());//消费模式
		
		//注册消息监听，监听消息队列的变化，负责消费消息的具体处理
		pushConsumer.registerMessageListener(new MessageListenerConcurrently() {
			
			public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
				
				try{
					if(msgs != null && msgs.size() > 0){
						for (Iterator<MessageExt> iterator = msgs.iterator(); iterator.hasNext();) {
							MessageExt messageExt = (MessageExt) iterator.next();
							boolean flag = basePushConsumer.getMessageHandler().handler(messageExt);
							if(!flag){
								logger.error("消费此消息失败："+messageExt);
							}
						}
					}
				}catch(Exception e){
					return ConsumeConcurrentlyStatus.RECONSUME_LATER;
				}
				
				return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
			}
		});
		try {
			pushConsumer.start();
		} catch (MQClientException e) {
			logger.error("启动push消费者失败！",e);
			return false;
		}
		return true;
	}

}
