package com.smartwasser.swrmq.producer;

import java.util.Date;
import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.util.SerializeUtils;

public class FuncProducerTest {
	
	public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
		FuncProducerTest producerTest = new FuncProducerTest();
		//producerTest.updateModel();
		producerTest.insertModel();
		//producerTest.deleteModel();
	}
	
	/**
	 * 测试用户话题-update类型
	 * @throws MQClientException 
	 * @throws InterruptedException 
	 * @throws MQBrokerException 
	 * @throws RemotingException 
	 */
	private void updateModel() throws MQClientException, RemotingException, MQBrokerException, InterruptedException{
		DefaultMQProducer producer = new DefaultMQProducer("topic-func-group");
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("func-update-instance");
		producer.start();
		
		SubSysFunc ssu = new SubSysFunc();
		ssu.setAppid("-1000");
		ssu.setChfuncmid(Long.valueOf(0));
		ssu.setCreatetime(new Date());
		ssu.setCreator("chenhao");
		ssu.setDelFlag("0");
		ssu.setFkSystemId("2341231");
		ssu.setFunccode("141231231");
		ssu.setFuncdesc("功能描述");
		ssu.setFuncnamech("测试功能");
		ssu.setFuncnameen("test");
		ssu.setFuncurl("/biansdf/fewfw");
		ssu.setId("1244123213");
		ssu.setIsapp("0");
		ssu.setIsmenu(Short.valueOf("0"));
		ssu.setParentid("");
		ssu.setPriority(Long.valueOf("0"));
		ssu.setUpdatetime(new Date());
		
		Message message = new Message("topic-func-update","UPDATE",UUID.randomUUID().toString(),SerializeUtils.serialize(ssu));
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
		DefaultMQProducer producer = new DefaultMQProducer("topic-func-group");
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("func-insert-instance");
		producer.start();
		for (int i = 0; i < 10; i++) {
			SubSysFunc ssu = new SubSysFunc();
			ssu.setAppid("-1000");
			ssu.setChfuncmid(Long.valueOf("0"));
			ssu.setCreatetime(new Date());
			ssu.setCreator("chenhao");
			ssu.setDelFlag("0");
			ssu.setFkSystemId("2341231");
			ssu.setFunccode("141231231");
			ssu.setFuncdesc("功能描述");
			ssu.setFuncnamech("测试功能");
			ssu.setFuncnameen("test");
			ssu.setFuncurl("/biansdf/fewfw");
			ssu.setId("1244123213"+i);
			ssu.setIsapp("0");
			ssu.setIsmenu(Short.valueOf("0"));
			ssu.setParentid("12312");
			ssu.setPriority(Long.valueOf("0"));
			ssu.setUpdatetime(new Date());
			
			Message message = new Message("topic-func-insert","INSERT",UUID.randomUUID().toString(),SerializeUtils.serialize(ssu));
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
		DefaultMQProducer producer = new DefaultMQProducer("topic-func-group");
		producer.setNamesrvAddr("192.168.2.116:9876");
		producer.setClientIP("192.168.2.115");
		producer.setInstanceName("func-delete-instance");
		producer.start();
		
		SubSysFunc ssu = new SubSysFunc();
		ssu.setId("cbc78d1c4f0311e6aa18000c29030dc2");
		
		Message message = new Message("topic-func-delete","DELETE",UUID.randomUUID().toString(),SerializeUtils.serialize(ssu));
		SendResult result = producer.send(message,30 * 1000);
		System.out.println(result.getSendStatus());
		
		producer.shutdown();
	}
	
}
