package com.smartwasser.swrmq.handler;

import com.alibaba.rocketmq.common.message.MessageExt;

public class FuncMessageHandler implements MessageHandler {

	@Override
	public boolean handler(MessageExt messageExt) {
		
		return false;
	}

}
