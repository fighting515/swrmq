package com.smartwasser.swrmq.handler;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.smartwasser.swrmq.util.Constant;

/**
 * 关于用户信息的消息处理类
 * <p>UserMessageHandler</p>
 * <p>@description: TODO</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月18日 下午2:07:01</p>
 */
public class UserMessageHandler implements MessageHandler {

	public boolean handler(MessageExt messageExt) {
		
		if(messageExt != null){
			String tag = messageExt.getTags();
			switch (tag) {
			case Constant.INSERT://添加
				return insert(messageExt);
			case Constant.UPDATE://修改
				return update(messageExt);
			case Constant.DELETE://删除
				return delete(messageExt);
			default:
				return true;
			}
		}else{
			return true;
		}
	
	}
	
	/**
	 * 处理需要添加的信息
	 * @param messageExt
	 * @return
	 */
	private boolean insert(MessageExt messageExt){
		//TODO 用户信息添加处理
		return true;
	}

	/**
	 * 处理需要更新的信息
	 * @param messageExt
	 * @return
	 */
	private boolean update(MessageExt messageExt){
		//TODO 用户信息更新处理
		return true;
	}
	
	/**
	 * 处理需要删除的信息
	 * @param messageExt
	 * @return
	 */
	private boolean delete(MessageExt messageExt){
		//TODO 用户信息删除处理
		return true;
	}
}
