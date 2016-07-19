package com.smartwasser.swrmq.handler;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * 
 * <p>MessageHandler</p>
 * <p>@description: Be in charge of message handle,for example:</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月15日 下午1:53:24</p>
 */
public interface MessageHandler {
	
	public boolean handler(MessageExt messageExt);
}
