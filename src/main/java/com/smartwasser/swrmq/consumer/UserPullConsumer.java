package com.smartwasser.swrmq.consumer;

import com.smartwasser.swrmq.handler.MessageHandler;

/**
 * 用户信息消费者-拉取类型
 * <p>UserConsumer</p>
 * <p>消费用户信息，包括用户的添加、删除、更新等操作，负责统一后台与各子系统间用户数据的一致性</p>
 * <p>@author chenhao</p>
 * <p>2016年7月14日</p>
 */
public class UserPullConsumer extends BasePullConsumer{
	
	public UserPullConsumer(MessageHandler messageHandler) {
		this.messageHandler = messageHandler;
	}
	
}
