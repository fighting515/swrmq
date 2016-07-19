package com.smartwasser.swrmq.consumer;

import java.util.UUID;

import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory();
		factory.setLocalIp("192.168.2.111");
		
		UserPullConsumer consumer = new UserPullConsumer(new UserMessageHandler());
		consumer.setInstanceName("scsj"+UUID.randomUUID());
		consumer.setMessageModel(MessageModel.BROADCASTING);
		consumer.setNameserverAddress("192.168.2.112:9876");
		consumer.setSubExpression("json");
		consumer.setTopic("topic-user-insert");
		consumer.setTopicGroup("topic-user-group");
		
		factory.registPullConsumer(consumer);
		
	}

}
