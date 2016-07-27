package com.smartwasser.swrmq.consumer;

import com.smartwasser.swrmq.handler.MessageHandler;

/**
 * 
 * <p>FuncPushConsumer</p>
 * <p>@description: 消费功能模块信息，包括功能模块的添加、删除、修改等操作</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月22日 下午3:56:20</p>
 */
public class FuncPushConsumer extends BasePushConsumer {
	
	public FuncPushConsumer(MessageHandler messageHandler) {
		this.messageHandler = messageHandler;
	}

}
