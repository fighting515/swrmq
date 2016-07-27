package com.smartwasser.swrmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.util.SerializeUtils;

/**
 * 租户用户信息生产者
 * <p>UserProducer</p>
 * <p></p>
 * <p>@author chenhao</p>
 * <p>2016年7月14日</p>
 */
public class ClientSysUserProducer extends BaseProducer{
	
	private Logger logger = LoggerFactory.getLogger(ClientSysUserProducer.class);
	
	public ClientSysUserProducer(String namesrvAddr,String instanceName,String topicGroup,String topic) throws MQClientException {
		super(namesrvAddr, instanceName, topicGroup, topic);
	}
	
	public void send(Object obj,String tags){
		if(obj != null){
			ClientSysUser clientSysUser = (ClientSysUser)obj;
			Message message = new Message(this.getTopic(),tags,clientSysUser.getId(),SerializeUtils.serialize(clientSysUser));
			try {
				SendResult result = this.getProducer().send(message,10000);
				SendStatus status = result.getSendStatus();
				if(status.equals(SendStatus.SEND_OK)){
					logger.info("rocketMq服务器处理结果：功能模块信息发送成功，用户名称："+clientSysUser.getUsername());
				}else if(status.equals(SendStatus.FLUSH_DISK_TIMEOUT)){
					logger.error("rocketMq服务器处理结果：刷盘超时，用户名称："+clientSysUser.getUsername());
				}else if(status.equals(SendStatus.FLUSH_SLAVE_TIMEOUT)){
					logger.error("rocketMq服务器处理结果：刷新SLAVE超时，用户名称："+clientSysUser.getUsername());
				}else if(status.equals(SendStatus.SLAVE_NOT_AVAILABLE)){
					logger.error("rocketMq服务器处理结果：SLAVE无效,用户名称："+clientSysUser.getUsername());
				}
			} catch (Exception e) {
				logger.error("发送用户信息失败："+clientSysUser.getUsername(),e);
			}
		}
		
	}
}
