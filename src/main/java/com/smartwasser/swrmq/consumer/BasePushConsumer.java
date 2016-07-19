package com.smartwasser.swrmq.consumer;

import java.util.HashMap;
import java.util.Map;

/**
 * push型消费者抽象类
 * <p>BasePushConsumer</p>
 * <p>@description: push型消费者，获取消费的方式为broker主动推送，定义监听，当消息队列发生变化时，会触发监听，且可以消费多个话题</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月19日 下午2:41:39</p>
 */
public abstract class BasePushConsumer extends BaseConsumer{
	
	private Map<String, String> topicMap = new HashMap<String, String>();// 话题和对应的子表达式
	
	public Map<String, String> getTopicMap() {
		return topicMap;
	}
	
}
