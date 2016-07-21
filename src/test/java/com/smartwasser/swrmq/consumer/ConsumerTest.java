package com.smartwasser.swrmq.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqConfigFactory;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		UserPullConsumer consumer = new UserPullConsumer(new UserMessageHandler());
		consumer.setInstanceName("scsj"+UUID.randomUUID());
		consumer.setNameserverAddress("192.168.2.112:9876");
		consumer.setSubExpression("json");
		consumer.setTopic("topic-user-insert");
		consumer.setTopicGroup("topic-user-group");
		
		List<BasePullConsumer> pullConsumers = new ArrayList<BasePullConsumer>();
		pullConsumers.add(consumer);
		
		RocketMqConfigFactory configFactory = new RocketMqConfigFactory("192.168.2.103", pullConsumers, null);
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory(configFactory);
		
	}

}
