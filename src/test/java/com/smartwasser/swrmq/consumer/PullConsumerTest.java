package com.smartwasser.swrmq.consumer;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.consumer.MessageQueueListener;
import com.alibaba.rocketmq.client.consumer.PullResult;
import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.message.MessageQueue;
import com.alibaba.rocketmq.remoting.exception.RemotingException;

public class PullConsumerTest {

	public static void main(String[] args) throws MQClientException {
		final DefaultMQPullConsumer pullConsumer = new DefaultMQPullConsumer("test-group");
		pullConsumer.setNamesrvAddr("192.168.2.104:9876");
		pullConsumer.setInstanceName("test-instance");
				
		pullConsumer.registerMessageQueueListener("test-topic-1", new MessageQueueListener() {
			
			public void messageQueueChanged(String topic, Set<MessageQueue> mqAll, Set<MessageQueue> mqDivided) {
				// TODO Auto-generated method stub
				System.out.println(topic);
				for (Iterator<MessageQueue> iterator = mqDivided.iterator(); iterator.hasNext();) {
					MessageQueue messageQueue = (MessageQueue) iterator.next();
					try {
						System.out.println("brokername:"+messageQueue.getBrokerName() + ",queue:"+messageQueue.getQueueId());
						PullResult pullResult = pullConsumer.pullBlockIfNotFound(messageQueue, null, 1, 30);
						List<MessageExt> list = pullResult.getMsgFoundList();
						for (Iterator<MessageExt> iterator2 = list.iterator(); iterator2.hasNext();) {
							MessageExt messageExt = (MessageExt) iterator2.next();
							System.out.println(new String(messageExt.getBody()));
						}
						
					} catch (MQClientException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemotingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MQBrokerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		pullConsumer.start();
		
	}

}
