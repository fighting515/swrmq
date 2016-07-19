package com.smartwasser.swrmq.consumer;

import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class ConsumerMultiTopicTest {
	
	public static void main(String[] args) throws MQClientException {
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory();
		factory.setLocalIp("192.168.2.111");
		
		UserPushConsumer consumer = new UserPushConsumer(new UserMessageHandler());
		consumer.setInstanceName("scsj"+UUID.randomUUID());
		consumer.setMessageModel(MessageModel.BROADCASTING);
		consumer.setNameserverAddress("192.168.2.112:9876");
		consumer.getTopicMap().put("topic-user-insert", "json");
		consumer.getTopicMap().put("topic-user-update", "xml");
		consumer.setTopicGroup("topic-user-group");
		
		factory.registPushConsumer(consumer);
	}

}
