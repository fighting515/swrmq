package com.smartwasser.swrmq.consumer;

import com.smartwasser.swrmq.handler.MessageHandler;

/**
 * 用户信息消费者-推送类型
 * <p>UserConsumer</p>
 * <p>处理由统一后台发送的关于用户信息的操作，包括用户的添加、删除、更新等操作，负责统一后台与各子系统间用户数据的一致性</p>
 * <p>@author chenhao</p>
 * <p>2016年7月14日</p>
 */
public class UserPushConsumer extends BasePushConsumer {

	public UserPushConsumer(MessageHandler messageHandler) {
		this.messageHandler = messageHandler;
	}
}
