package com.smartwasser.swrmq.consumer;

import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.smartwasser.swrmq.handler.MessageHandler;

/**
 * 消费者抽象类型
 * <p>BaseConsumer</p>
 * <p>@description: 消费者抽象类，包含公共的消费者属性</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月19日 下午2:40:06</p>
 */
public abstract class BaseConsumer {

	private String topicGroup;// 话题组
	private String nameserverAddress;// rocket nameserver ip:port
	private String instanceName;// 实例名,非必填
	private MessageModel messageModel = MessageModel.BROADCASTING;// 消费模式：1 集群消费
																	// 2 广播消费
																	// 默认广播消费

	protected MessageHandler messageHandler;// 消息处理者

	public String getTopicGroup() {
		return topicGroup;
	}

	public void setTopicGroup(String topicGroup) {
		this.topicGroup = topicGroup;
	}

	public String getNameserverAddress() {
		return nameserverAddress;
	}

	public void setNameserverAddress(String nameserverAddress) {
		this.nameserverAddress = nameserverAddress;
	}

	public String getInstanceName() {
		return instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public MessageModel getMessageModel() {
		return messageModel;
	}

	public void setMessageModel(MessageModel messageModel) {
		this.messageModel = messageModel;
	}

	public MessageHandler getMessageHandler() {
		return messageHandler;
	}

}
