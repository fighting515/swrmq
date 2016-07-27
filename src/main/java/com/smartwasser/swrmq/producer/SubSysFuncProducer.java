package com.smartwasser.swrmq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.util.SerializeUtils;

/**
 * 子系统功能模块信息-生产者
 * <p>SubSysFuncProducer</p>
 * <p>@description: TODO</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月25日 下午4:31:41</p>
 */
public class SubSysFuncProducer extends BaseProducer{
	
	private Logger logger = LoggerFactory.getLogger(SubSysFuncProducer.class);

	public SubSysFuncProducer(String namesrvAddr, String instanceName, String topicGroup, String topic)
			throws MQClientException {
		super(namesrvAddr, instanceName, topicGroup, topic);
	}
	
	@Override
	public void send(Object obj,String tags){
		if(obj != null){
			SubSysFunc subSysFunc = (SubSysFunc)obj;
			Message message = new Message(this.getTopic(),tags,subSysFunc.getId(),SerializeUtils.serialize(subSysFunc));
			try {
				SendResult result = this.getProducer().send(message,10000);
				SendStatus status = result.getSendStatus();
				if(status.equals(SendStatus.SEND_OK)){
					logger.info("rocketMq服务器处理结果：功能模块信息发送成功，功能模块名称："+subSysFunc.getFuncnamech());
				}else if(status.equals(SendStatus.FLUSH_DISK_TIMEOUT)){
					logger.error("rocketMq服务器处理结果：刷盘超时，功能模块名称："+subSysFunc.getFuncnamech());
				}else if(status.equals(SendStatus.FLUSH_SLAVE_TIMEOUT)){
					logger.error("rocketMq服务器处理结果：刷新SLAVE超时，功能模块名称："+subSysFunc.getFuncnamech());
				}else if(status.equals(SendStatus.SLAVE_NOT_AVAILABLE)){
					logger.error("rocketMq服务器处理结果：SLAVE无效,功能模块名称："+subSysFunc.getFuncnamech());
				}
			} catch (Exception e) {
				logger.error("发送功能信息失败："+subSysFunc.getFuncnamech(),e);
			}
		}
	}

}
