package com.smartwasser.swrmq.producer;

import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;

public class ProducerTest {
	
	public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
		ProducerTest producerTest = new ProducerTest();
		producerTest.updateModel();
		producerTest.insertModel();
	}
	
	/**
	 * 测试用户话题-update类型
	 * @throws MQClientException 
	 * @throws InterruptedException 
	 * @throws MQBrokerException 
	 * @throws RemotingException 
	 */
	private void updateModel() throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
		DefaultMQProducer producer = new DefaultMQProducer("topic-user-group");
		producer.setNamesrvAddr("192.168.2.112:9876");
		producer.setClientIP("192.168.2.102");
		producer.setInstanceName("user-update-instance");
		producer.start();
		
		for (int i = 0; i < 10; i++) {
			Message message = new Message("topic-user-update","xml",UUID.randomUUID().toString(),"this is a test user of xml".getBytes());
			SendResult result = producer.send(message,30 * 1000);
			System.out.println(result.getSendStatus());
		}
		producer.shutdown();
	}
	
	/**
	 * 测试用户话题-insert类型
	 * @throws MQClientException 
	 * @throws InterruptedException 
	 * @throws MQBrokerException 
	 * @throws RemotingException 
	 */
	private void insertModel() throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
		DefaultMQProducer producer = new DefaultMQProducer("topic-user-group");
		producer.setNamesrvAddr("192.168.2.112:9876");
		producer.setClientIP("192.168.2.102");
		producer.setInstanceName("user-insert-instance");
		producer.start();
		for (int i = 0; i < 10; i++) {
			Message message = new Message("topic-user-insert","json",UUID.randomUUID().toString(),"this is a test user of json".getBytes());
			SendResult result = producer.send(message, 30 * 1000);
			System.out.println(result.getSendStatus());
		}
		producer.shutdown();
	}
	
}
