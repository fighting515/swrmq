package com.smartwasser.swrmq.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqConfigFactory;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class ConsumerMultiTopicTest {
	
	public static void main(String[] args) throws MQClientException {
		
		UserPushConsumer consumer = new UserPushConsumer(new UserMessageHandler());
		consumer.setInstanceName("scsj"+UUID.randomUUID());
		consumer.setNameserverAddress("192.168.2.116:9876");
		consumer.getTopicMap().put("topic-user-insert", "INSERT");
		consumer.getTopicMap().put("topic-user-update", "update");
		consumer.setTopicGroup("topic-user-group");
		
		List<BasePushConsumer> pushConsumers = new ArrayList<BasePushConsumer>();
		pushConsumers.add(consumer);
		
		RocketMqConfigFactory configFactory = new RocketMqConfigFactory("192.168.2.115", null, pushConsumers);
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory(configFactory);

	}

}
