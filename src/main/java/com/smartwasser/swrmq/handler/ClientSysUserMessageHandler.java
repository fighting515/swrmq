package com.smartwasser.swrmq.handler;


import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.smartwasser.swrmq.model.BcSysUser;
import com.smartwasser.swrmq.model.BcSysUserExample;
import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.mybatis.interceptor.SchemaInterceptor;
import com.smartwasser.swrmq.service.RmqBcSysUserService;
import com.smartwasser.swrmq.util.Constant;
import com.smartwasser.swrmq.util.SerializeUtils;

/**
 * 关于用户信息的消息处理类
 * <p>UserMessageHandler</p>
 * <p>@description: TODO</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月18日 下午2:07:01</p>
 */
public class ClientSysUserMessageHandler implements MessageHandler {
	
	private Logger logger = LoggerFactory.getLogger(ClientSysUserMessageHandler.class);
	
	private RmqBcSysUserService rmqBcSysUserService;
	private SchemaInterceptor schemaInterceptor;

	public synchronized boolean handler(MessageExt messageExt) {
		
		if(messageExt != null){
			
			ClientSysUser csu = (ClientSysUser)SerializeUtils.deserialize(messageExt.getBody());
			
			Map<String, String> schema = csu.getSchema();
			if(schema == null){
				return false;
			}else{
				String system = schemaInterceptor.getProperties().getProperty("system");
				schemaInterceptor.getProperties().setProperty("schema",schemaInterceptor.getProperties().getProperty(system));
			}
			
			String tag = messageExt.getTags();
			if (tag.equals(Constant.INSERT)) {
				//添加
				return insert(csu);
			}else if(tag.equals( Constant.UPDATE)){
				//修改
				return update(csu);
			}else if(tag.equals(Constant.DELETE)){
				//删除
				return delete(csu);
			}else{
				System.out.println(messageExt);
				return true;
			}
		}else{
			logger.info("");
			return true;
		}
	}
	
	/**
	 * 处理需要添加的信息
	 * @param messageExt
	 * @return
	 */
	private boolean insert(ClientSysUser csu){
		try {
			if(this.rmqBcSysUserService.getById(csu.getId()) != null){
				return this.update(csu);
			}
			
			BcSysUser bsu = new BcSysUser();
			bsu.setEmail(csu.getEmail());
			bsu.setId(csu.getId());
			bsu.setPassword(csu.getPassword());
			bsu.setUsername(csu.getUsername());
			bsu.setUsernamecn(csu.getUsernamecn());
			bsu.setState(Long.valueOf(csu.getState()));
			bsu.setSuperAdminFlag(csu.getSuperAdminFlag());
			rmqBcSysUserService.save(bsu);
		} catch (Exception e) {
			logger.error("用户信息添加处理失败！",e);
			return false;
		}
		
		return true;
	}

	/**
	 * 处理需要更新的信息
	 * @param messageExt
	 * @return
	 */
	private boolean update(ClientSysUser csu){
			
		if(this.rmqBcSysUserService.getById(csu.getId()) == null){
			return this.insert(csu);
		}
		
		BcSysUser bsu = new BcSysUser();
		bsu.setEmail(csu.getEmail());
		bsu.setId(csu.getId());
		bsu.setPassword(csu.getPassword());
		bsu.setUsername(csu.getUsername());
		bsu.setUsernamecn(csu.getUsernamecn());
		bsu.setSuperAdminFlag(csu.getSuperAdminFlag());
		
		BcSysUserExample example = new BcSysUserExample();
		example.createCriteria().andIdEqualTo(csu.getId());
		
		rmqBcSysUserService.update(bsu, example);
		return true;
	}
	
	/**
	 * 处理需要删除的信息
	 * @param messageExt
	 * @return
	 */
	private boolean delete(ClientSysUser csu){
		rmqBcSysUserService.delete(csu.getId());
		return true;
	}

	public RmqBcSysUserService getRmqBcSysUserService() {
		return rmqBcSysUserService;
	}

	public void setRmqBcSysUserService(RmqBcSysUserService rmqBcSysUserService) {
		this.rmqBcSysUserService = rmqBcSysUserService;
	}

	public SchemaInterceptor getSchemaInterceptor() {
		return schemaInterceptor;
	}

	public void setSchemaInterceptor(SchemaInterceptor schemaInterceptor) {
		this.schemaInterceptor = schemaInterceptor;
	}
}
