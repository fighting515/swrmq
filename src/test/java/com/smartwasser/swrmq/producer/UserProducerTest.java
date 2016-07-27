package com.smartwasser.swrmq.producer;

import java.util.Date;
import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.util.SerializeUtils;

public class UserProducerTest {
	
	public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
		UserProducerTest userProducerTest = new UserProducerTest();
		userProducerTest.updateModel();
		userProducerTest.insertModel();
		userProducerTest.deleteModel();
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
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("user-update-instance");
		producer.start();
		
		ClientSysUser csu = new ClientSysUser();
		csu.setCreateTime(new Date());
		csu.setCreator("chenhao");
		csu.setDelFlag("0");
		csu.setEmail("739483782@qq.com");
		csu.setFkClientUntiId("123214123");
		csu.setId("cb5bb47b4f0311e6aa18000c29030dc2");
		csu.setPassword("12421341");
		csu.setRemark("备注");
		csu.setState("0");
		csu.setSuperAdminFlag("1");
		csu.setUpdateTime(new Date());
		csu.setUsername("fighting_UPDATE");
		csu.setUsernamecn("陈浩");
		
		Message message = new Message("topic-user-update","UPDATE",UUID.randomUUID().toString(),SerializeUtils.serialize(csu));
		SendResult result = producer.send(message,30 * 1000);
		System.out.println(result.getSendStatus());
		
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
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("user-insert-instance");
		producer.start();
		for (int i = 0; i < 10; i++) {
			ClientSysUser csu = new ClientSysUser();
			csu.setCreateTime(new Date());
			csu.setCreator("chenhao");
			csu.setDelFlag("0");
			csu.setEmail("739483782@qq.com");
			csu.setFkClientUntiId("123214123");
			csu.setId("123123");
			csu.setPassword("12421341");
			csu.setRemark("备注");
			csu.setState("0");
			csu.setSuperAdminFlag("1");
			csu.setUpdateTime(new Date());
			csu.setUsername("fighting");
			csu.setUsernamecn("陈浩");
			
			Message message = new Message("topic-user-insert","INSERT",UUID.randomUUID().toString(),SerializeUtils.serialize(csu));
			SendResult result = producer.send(message, 30 * 1000);
			System.out.println(result.getSendStatus());
		}
		producer.shutdown();
	}
	
	/**
	 * 测试用户话题-DELETE类型
	 * @throws MQClientException 
	 * @throws InterruptedException 
	 * @throws MQBrokerException 
	 * @throws RemotingException 
	 */
	private void deleteModel() throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
		DefaultMQProducer producer = new DefaultMQProducer("topic-user-group");
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("user-delete-instance");
		producer.start();
		
		ClientSysUser csu = new ClientSysUser();
		csu.setId("cbc78d1c4f0311e6aa18000c29030dc2");
		
		Message message = new Message("topic-user-delete","DELETE",UUID.randomUUID().toString(),SerializeUtils.serialize(csu));
		SendResult result = producer.send(message,30 * 1000);
		System.out.println(result.getSendStatus());
		
		producer.shutdown();
	}
	
}
