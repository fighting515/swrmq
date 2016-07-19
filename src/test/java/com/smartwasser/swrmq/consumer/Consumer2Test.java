package com.smartwasser.swrmq.consumer;

import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.factory.RocketMqRegisterFactory;
import com.smartwasser.swrmq.handler.UserMessageHandler;

public class Consumer2Test {
	
	public static void main(String[] args) {
		RocketMqRegisterFactory factory = new RocketMqRegisterFactory();
		factory.setLocalIp("192.168.2.111");
		
		UserPullConsumer consumer2 = new UserPullConsumer(new UserMessageHandler());
		consumer2.setInstanceName("scsj-1");
		consumer2.setMessageModel(MessageModel.BROADCASTING);
		consumer2.setNameserverAddress("192.168.2.112:9876");
		consumer2.setSubExpression("xml");
		consumer2.setTopic("topic-user-update");
		consumer2.setTopicGroup("topic-user-group");
		
		factory.registPullConsumer(consumer2);
		
		UserPullConsumer consumer3 = new UserPullConsumer(new UserMessageHandler());
		consumer3.setInstanceName("scsj-2");
		consumer3.setMessageModel(MessageModel.BROADCASTING);
		consumer3.setNameserverAddress("192.168.2.112:9876");
		consumer3.setSubExpression("xml");
		consumer3.setTopic("topic-user-update");
		consumer3.setTopicGroup("topic-user-group");
		
		factory.registPullConsumer(consumer3);
	}

}
