package com.smartwasser.swrmq.factory;

import java.util.ArrayList;
import java.util.List;

import com.smartwasser.swrmq.consumer.BasePullConsumer;
import com.smartwasser.swrmq.consumer.BasePushConsumer;

public class RocketMqConfigFactory {
	
	private String localIp;//本机IP
	private List<BasePullConsumer> pullConsumers = new ArrayList<BasePullConsumer>();//已注册的拉取型消费者集合
	private List<BasePushConsumer> pushConsumers = new ArrayList<BasePushConsumer>();//已注册的推送型消费者集合
	
	public RocketMqConfigFactory(String localIp,List<BasePullConsumer> pullConsumers,List<BasePushConsumer> pushConsumers) {
		super();
		this.localIp = localIp;
		if(pullConsumers != null && pullConsumers.size() > 0){
			this.pullConsumers.addAll(pullConsumers);
		}
		if(pushConsumers != null && pushConsumers.size() > 0){
			this.pushConsumers.addAll(pushConsumers);
		}
	}

	public String getLocalIp() {
		return localIp;
	}

	public void setLocalIp(String localIp) {
		this.localIp = localIp;
	}

	public List<BasePullConsumer> getPullConsumers() {
		return pullConsumers;
	}

	public List<BasePushConsumer> getPushConsumers() {
		return pushConsumers;
	}
}
