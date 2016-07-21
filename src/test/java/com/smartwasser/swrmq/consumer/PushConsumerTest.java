package com.smartwasser.swrmq.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqConfigFactory;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class PushConsumerTest {
	
	public static void main(String[] args) throws MQClientException {
		PushConsumerTest pushTest = new PushConsumerTest();
		pushTest.test2();
	}
	
	public void test1() throws MQClientException{
		DefaultMQPushConsumer pushConsumer = new DefaultMQPushConsumer();
		pushConsumer.setNamesrvAddr("192.168.2.104:9876");//设置nameserver的IP和端口
		pushConsumer.setConsumerGroup("ptp-group");//设置消费群组
		pushConsumer.subscribe("ptp-topic", "string");//设置话题名称和标记
		pushConsumer.setClientIP("192.168.2.102");//设置本机IP
		
		//注册消息监听，负责消费消息的具体处理
		pushConsumer.registerMessageListener(new MessageListenerConcurrently() {
			
			public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
				
				try{
					System.out.println(msgs);
				}catch(Exception e){
					return ConsumeConcurrentlyStatus.RECONSUME_LATER;
				}
				
				return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
			}
		});
		pushConsumer.start();
	}
	
	public void test2() throws MQClientException{
		
		UserPushConsumer consumer = new UserPushConsumer(new UserMessageHandler());
		consumer.setInstanceName("scsj"+UUID.randomUUID());
		consumer.setNameserverAddress("192.168.2.112:9876");
		consumer.getTopicMap().put("topic-user-insert", "json");
		consumer.setTopicGroup("topic-user-group");
		
		List<BasePushConsumer> pushConsumers = new ArrayList<BasePushConsumer>();
		pushConsumers.add(consumer);
		
		RocketMqConfigFactory configFactory = new RocketMqConfigFactory("192.168.2.103", null, pushConsumers);
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory(configFactory);
	}

}
