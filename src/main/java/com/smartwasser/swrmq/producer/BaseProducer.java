package com.smartwasser.swrmq.producer;

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
	
}
