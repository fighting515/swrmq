package com.smartwasser.swrmq.consumer;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqConfigFactory;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class Consumer2Test {
	
	public static void main(String[] args) {
		
		UserPullConsumer consumer2 = new UserPullConsumer(new UserMessageHandler());
		consumer2.setInstanceName("scsj-1");
		consumer2.setNameserverAddress("192.168.2.112:9876");
		consumer2.setSubExpression("xml");
		consumer2.setTopic("topic-user-update");
		consumer2.setTopicGroup("topic-user-group");
		
		UserPullConsumer consumer3 = new UserPullConsumer(new UserMessageHandler());
		consumer3.setInstanceName("scsj-2");
		consumer3.setNameserverAddress("192.168.2.112:9876");
		consumer3.setSubExpression("xml");
		consumer3.setTopic("topic-user-update");
		consumer3.setTopicGroup("topic-user-group");
		
		List<BasePullConsumer> pullConsumers = new ArrayList<BasePullConsumer>();
		pullConsumers.add(consumer2);
		pullConsumers.add(consumer3);
		
		RocketMqConfigFactory configFactory = new RocketMqConfigFactory("192.168.2.103", pullConsumers, null);
		
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory(configFactory);
	}

}
