package com.smartwasser.swrmq.consumer;

/**
 * pull型消费者抽象类
 * <p>BasePullConsumer</p>
 * <p>@description: pull型消费者抽象类,获取消费的方式为主动拉取,pull型消费者只能消费一个话题</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月19日 下午2:41:01</p>
 */
public abstract class BasePullConsumer extends BaseConsumer{
	
	private String topic;//话题
	private String subExpression;//子表达式，用来做关键词过滤
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubExpression() {
		return subExpression;
	}
	public void setSubExpression(String subExpression) {
		this.subExpression = subExpression;
	}
	
}
