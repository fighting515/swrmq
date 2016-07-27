package com.smartwasser.swrmq.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.smartwasser.swrmq.model.BcSysFunc;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.model.SubSysFuncExample;
import com.smartwasser.swrmq.service.RmqSubSysFuncService;
import com.smartwasser.swrmq.util.Constant;
import com.smartwasser.swrmq.util.SerializeUtils;

/**
 * 
 * <p>FuncMessageHandler</p>
 * <p>@description: 功能模块消息处理</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月22日 上午10:22:24</p>
 */
public class BcSysFuncMessageHandler implements MessageHandler {
	
	private Logger logger = LoggerFactory.getLogger(ClientSysUserMessageHandler.class);
	
	private RmqSubSysFuncService  rmqSubSysFuncService;
	
	@Override
	public synchronized boolean handler(MessageExt messageExt) {
		
		if(messageExt != null){
			String tag = messageExt.getTags();
			if (tag.equals(Constant.INSERT)) {
				//添加
				return insert(messageExt);
			}else if(tag.equals( Constant.UPDATE)){
				//修改
				return update(messageExt);
			}else if(tag.equals(Constant.DELETE)){
				//删除
				return delete(messageExt);
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
	private boolean insert(MessageExt messageExt){
		if(messageExt != null){
			try {
				BcSysFunc ssf = (BcSysFunc)SerializeUtils.deserialize(messageExt.getBody());
				
				if(this.rmqSubSysFuncService.getById(ssf.getId()) != null){
					return this.update(messageExt);
				}
				
				SubSysFunc bsf = new SubSysFunc();
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
				rmqSubSysFuncService.save(bsf);
			} catch (Exception e) {
				logger.error("用户信息添加处理失败！",e);
				return false;
			}
		}
		return true;
	}

	/**
	 * 处理需要更新的信息
	 * @param messageExt
	 * @return
	 */
	private boolean update(MessageExt messageExt){
		if(messageExt != null){
			BcSysFunc ssf = (BcSysFunc)SerializeUtils.deserialize(messageExt.getBody());
			
			if(this.rmqSubSysFuncService.getById(ssf.getId()) == null){
				return this.insert(messageExt);
			}
			
			SubSysFunc bsf = new SubSysFunc();
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
			SubSysFuncExample example = new SubSysFuncExample();
			example.createCriteria().andIdEqualTo(bsf.getId());
			
			rmqSubSysFuncService.update(bsf, example);
		}
		return true;
	}
	
	/**
	 * 处理需要删除的信息
	 * @param messageExt
	 * @return
	 */
	private boolean delete(MessageExt messageExt){
		if(messageExt != null){
			BcSysFunc ssf = (BcSysFunc)SerializeUtils.deserialize(messageExt.getBody());
			rmqSubSysFuncService.delete(ssf.getId());
		}
		return true;
	}

	public void setRmqSubSysFuncService(RmqSubSysFuncService rmqSubSysFuncService) {
		this.rmqSubSysFuncService = rmqSubSysFuncService;
	}

}
