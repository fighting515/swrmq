package com.smartwasser.swrmq.producer;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;

/**
 * 生产者抽象类
 * <p>BaseProducer</p>
 * <p>@description: 生产者抽象类，定义公共属性</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月19日 下午6:37:56</p>
 */
public abstract class BaseProducer {
	
	private String namesrvAddr;
	private String instanceName;
	private String topicGroup;
	private String topic;
	private DefaultMQProducer producer;
	
	public BaseProducer(String namesrvAddr,String instanceName,String topicGroup,String topic) throws MQClientException {
		this.producer = new DefaultMQProducer(topicGroup);
		this.producer.setNamesrvAddr(namesrvAddr);
		this.producer.setInstanceName(instanceName);
		this.namesrvAddr = namesrvAddr;
		this.instanceName = instanceName;
		this.topicGroup = topicGroup;
		this.topic = topic;
		this.producer.start();
	}
	
	public abstract void send(Object obj,String tag);
	
	public String getNamesrvAddr() {
		return namesrvAddr;
	}
	public void setNamesrvAddr(String namesrvAddr) {
		this.namesrvAddr = namesrvAddr;
	}
	public String getInstanceName() {
		return instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}
	public DefaultMQProducer getProducer() {
		return producer;
	}
	public void setProducer(DefaultMQProducer producer) {
		this.producer = producer;
	}
	public String getTopicGroup() {
		return topicGroup;
	}
	public void setTopicGroup(String topicGroup) {
		this.topicGroup = topicGroup;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
}
