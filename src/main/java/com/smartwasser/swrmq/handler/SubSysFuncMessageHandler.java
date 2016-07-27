package com.smartwasser.swrmq.handler;

import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.smartwasser.swrmq.model.BcSysFunc;
import com.smartwasser.swrmq.model.BcSysFuncExample;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.mybatis.interceptor.SchemaInterceptor;
import com.smartwasser.swrmq.service.RmqBcSysFuncService;
import com.smartwasser.swrmq.util.Constant;
import com.smartwasser.swrmq.util.SerializeUtils;

/**
 * 
 * <p>FuncMessageHandler</p>
 * <p>@description: 功能模块消息处理</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月22日 上午10:22:24</p>
 */
public class SubSysFuncMessageHandler implements MessageHandler {
	
	private Logger logger = LoggerFactory.getLogger(ClientSysUserMessageHandler.class);
	
	private RmqBcSysFuncService  rmqBcSysFuncService;
	private SchemaInterceptor schemaInterceptor;
	
	@Override
	public synchronized boolean handler(MessageExt messageExt) {
		
		if(messageExt != null){
			SubSysFunc ssf = (SubSysFunc)SerializeUtils.deserialize(messageExt.getBody());
			
			Map<String, String> schema = ssf.getSchema();
			if(schema == null){
				return false;
			}else{
				String system = schemaInterceptor.getProperties().getProperty("system");
				schemaInterceptor.getProperties().setProperty("schema",schemaInterceptor.getProperties().getProperty(system));
			}
			
			String tag = messageExt.getTags();
			if (tag.equals(Constant.INSERT)) {
				//添加
				return insert(ssf);
			}else if(tag.equals( Constant.UPDATE)){
				//修改
				return update(ssf);
			}else if(tag.equals(Constant.DELETE)){
				//删除
				return delete(ssf);
			}else{
				System.out.println(messageExt);
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
	private boolean insert(SubSysFunc ssf){
		try {
			
			if(this.rmqBcSysFuncService.getById(ssf.getId()) != null){
				return this.update(ssf);
			}
			
			BcSysFunc bsf = new BcSysFunc();
			bsf.setAppid(ssf.getAppid());
			bsf.setChfuncmid(Long.valueOf(ssf.getChfuncmid()));
			bsf.setCreatetime(ssf.getCreatetime());
			bsf.setFunccode(ssf.getFunccode());
			bsf.setFuncdesc(ssf.getFuncdesc());
			bsf.setFuncnamech(ssf.getFuncnamech());
			bsf.setFuncnameen(ssf.getFuncnameen());
			bsf.setFuncurl(ssf.getFuncurl());
			bsf.setId(ssf.getId());
			bsf.setIsapp(ssf.getIsapp());
			bsf.setIsmenu(Short.valueOf(ssf.getIsmenu()));
			bsf.setParentid(ssf.getParentid());
			bsf.setPriority(Long.valueOf(ssf.getPriority()));
			rmqBcSysFuncService.save(bsf);
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
	private boolean update(SubSysFunc ssf){
		
		if(this.rmqBcSysFuncService.getById(ssf.getId()) == null){
			return this.insert(ssf);
		}
		
		BcSysFunc bsf = new BcSysFunc();
		bsf.setAppid(ssf.getAppid());
		bsf.setChfuncmid(Long.valueOf(ssf.getChfuncmid()));
		bsf.setCreatetime(ssf.getCreatetime());
		bsf.setFunccode(ssf.getFunccode());
		bsf.setFuncdesc(ssf.getFuncdesc());
		bsf.setFuncnamech(ssf.getFuncnamech());
		bsf.setFuncnameen(ssf.getFuncnameen());
		bsf.setFuncurl(ssf.getFuncurl());
		bsf.setId(ssf.getId());
		bsf.setIsapp(ssf.getIsapp());
		bsf.setIsmenu(Short.valueOf(ssf.getIsmenu()));
		bsf.setParentid(ssf.getParentid());
		bsf.setPriority(Long.valueOf(ssf.getPriority()));
		BcSysFuncExample example = new BcSysFuncExample();
		example.createCriteria().andIdEqualTo(bsf.getId());
		
		rmqBcSysFuncService.update(bsf, example);
		return true;
	}
	
	/**
	 * 处理需要删除的信息
	 * @param messageExt
	 * @return
	 */
	private boolean delete(SubSysFunc ssf){
		rmqBcSysFuncService.delete(ssf.getId());
		return true;
	}

	public RmqBcSysFuncService getRmqBcSysFuncService() {
		return rmqBcSysFuncService;
	}

	public void setRmqBcSysFuncService(RmqBcSysFuncService rmqBcSysFuncService) {
		this.rmqBcSysFuncService = rmqBcSysFuncService;
	}

	public SchemaInterceptor getSchemaInterceptor() {
		return schemaInterceptor;
	}

	public void setSchemaInterceptor(SchemaInterceptor schemaInterceptor) {
		this.schemaInterceptor = schemaInterceptor;
	}

}
