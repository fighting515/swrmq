package com.smartwasser.swrmq.quartz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.smartwasser.swrmq.model.BcSysFunc;
import com.smartwasser.swrmq.model.BcSysUser;
import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.model.MessageSendTask;
import com.smartwasser.swrmq.model.MessageSendTaskExample;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.producer.BaseProducer;
import com.smartwasser.swrmq.service.MessageSendTaskService;
import com.smartwasser.swrmq.service.RmqBcSysFuncService;
import com.smartwasser.swrmq.service.RmqBcSysUserService;
import com.smartwasser.swrmq.service.RmqClientSysUserService;
import com.smartwasser.swrmq.service.RmqSubSysFuncService;
import com.smartwasser.swrmq.util.Constant;

/**
 * 消息处理定时任务
 * <p>MessageSendTaskJob</p>
 * <p>@description: TODO</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月25日 下午4:22:27</p>
 */
public class MessageSendTaskJob extends QuartzJobBean{

	private RmqBcSysFuncService rmqBcSysFuncService;
	private RmqBcSysUserService rmqBcSysUserService;
	private RmqClientSysUserService rmqClientSysUserService;
	private RmqSubSysFuncService rmqSubSysFuncService;
	private MessageSendTaskService messageSendTaskService;
	
	private Map<String, BaseProducer> producers;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		MessageSendTaskExample example = new MessageSendTaskExample();
		example.createCriteria().andSendStateEqualTo("0");
		
		List<MessageSendTask> list = messageSendTaskService.getList(example);
		if(list != null && list.size() > 0){
			for (Iterator<MessageSendTask> iterator = list.iterator(); iterator.hasNext();) {
				MessageSendTask messageSendTask = (MessageSendTask) iterator.next();
				String id = messageSendTask.getDataId();
				String table = messageSendTask.getDataTable();
				String optType = messageSendTask.getOptType();
				if(table.equals(Constant.CLIENT_SYS_USER)){
					clientSysUserHandler(id,table,optType);
				}else if(table.equals(Constant.SUB_SYS_FUNC)){
					subSysFuncHandler(id, table, optType);
				}else if(table.equals(Constant.BC_SYS_USER)){
					bcSysUserHandler(id, table, optType);
				}else if(table.equals(Constant.BC_SYS_FUNC)){
					bcSysFuncHandler(id, table, optType);
				}
			}
		}
		
	}
	
	/**
	 * 租户用户发送
	 * @param id
	 * @param table
	 * @param optType
	 */
	private void clientSysUserHandler(String id,String table,String optType){
		ClientSysUser user = rmqClientSysUserService.getById(id);
		
		Map<String,String> schemaMap = new HashMap<String,String>();
		
		List<Map<String,String>> schema = rmqClientSysUserService.selectUserSchema(user.getUsername());
		for (Iterator iterator = schema.iterator(); iterator.hasNext();) {
			Map<String, String> map = (Map<String, String>) iterator.next();
			schemaMap.put(map.get("system_name_en"), map.get("schema_name"));
		}
		user.setSchema(schemaMap);
		
		BaseProducer producer = producers.get(Constant.CLIENT_SYS_USER);
		if(optType.equals(Constant.INSERT)){
			producer.send(user, Constant.INSERT);
		}else if(optType.equals(Constant.UPDATE)){
			producer.send(user, Constant.UPDATE);
		}else if(optType.equals(Constant.DELETE)){
			producer.send(user, Constant.DELETE);
		}
	}
	
	/**
	 * 子系统功能发送
	 * @param id
	 * @param table
	 * @param optType
	 */
	private void subSysFuncHandler(String id,String table,String optType){
		SubSysFunc func = rmqSubSysFuncService.getById(id);
		BaseProducer producer = producers.get(Constant.CLIENT_SYS_USER);
		if(optType.equals(Constant.INSERT)){
			producer.send(func, Constant.INSERT);
		}else if(optType.equals(Constant.UPDATE)){
			producer.send(func, Constant.UPDATE);
		}else if(optType.equals(Constant.DELETE)){
			producer.send(func, Constant.DELETE);
		}
	}
	
	/**
	 * 基础用户发送
	 * @param id
	 * @param table
	 * @param optType
	 */
	private void bcSysUserHandler(String id,String table,String optType){
		BcSysUser user = rmqBcSysUserService.getById(id);
		BaseProducer producer = producers.get(Constant.BC_SYS_USER);
		if(optType.equals(Constant.INSERT)){
			producer.send(user, Constant.INSERT);
		}else if(optType.equals(Constant.UPDATE)){
			producer.send(user, Constant.UPDATE);
		}else if(optType.equals(Constant.DELETE)){
			producer.send(user, Constant.DELETE);
		}
	}
	
	/**
	 * 子系统功能发送
	 * @param id
	 * @param table
	 * @param optType
	 */
	private void bcSysFuncHandler(String id,String table,String optType){
		BcSysFunc func = rmqBcSysFuncService.getById(id);
		BaseProducer producer = producers.get(Constant.CLIENT_SYS_USER);
		if(optType.equals(Constant.INSERT)){
			producer.send(func, Constant.INSERT);
		}else if(optType.equals(Constant.UPDATE)){
			producer.send(func, Constant.UPDATE);
		}else if(optType.equals(Constant.DELETE)){
			producer.send(func, Constant.DELETE);
		}
	}

	public void setRmqBcSysFuncService(RmqBcSysFuncService rmqBcSysFuncService) {
		this.rmqBcSysFuncService = rmqBcSysFuncService;
	}

	public void setRmqBcSysUserService(RmqBcSysUserService rmqBcSysUserService) {
		this.rmqBcSysUserService = rmqBcSysUserService;
	}

	public void setMessageSendTaskService(MessageSendTaskService messageSendTaskService) {
		this.messageSendTaskService = messageSendTaskService;
	}

	public void setRmqClientSysUserService(RmqClientSysUserService rmqClientSysUserService) {
		this.rmqClientSysUserService = rmqClientSysUserService;
	}

	public void setRmqSubSysFuncService(RmqSubSysFuncService rmqSubSysFuncService) {
		this.rmqSubSysFuncService = rmqSubSysFuncService;
	}

	public void setProducers(Map<String, BaseProducer> producers) {
		this.producers = producers;
	}
	
}
