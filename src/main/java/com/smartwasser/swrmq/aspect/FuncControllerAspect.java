package com.smartwasser.swrmq.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.producer.SubSysFuncProducer;
import com.smartwasser.swrmq.util.Constant;
import com.smartwasser.swrmq.util.ParseObjectUtils;

/**
 * 
 * <p>
 * FuncControllerAspect
 * </p>
 * <p>
 * @description: funcController的切面，在功能信息添加、修改、删除操作执行成功后，同步将消息下发到各子系统
 * </p>
 * <p>
 * @author: chenhao
 * </p>
 * <p>
 * @date: 2016年7月24日 下午1:26:19
 * </p>
 */
public class FuncControllerAspect extends MyAspect {

	private Logger logger = LoggerFactory.getLogger(FuncControllerAspect.class);

	private SubSysFuncProducer subSysFuncProducer;

	@Override
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		if (methodName.equals("save")) {
			logger.info("发送用户信息，类型：insert");
			this.subSysFuncProducer.send(transfer(args[0]), Constant.INSERT);
		} else if (methodName.equals("update")) {
			logger.info("发送用户信息，类型：update");
			this.subSysFuncProducer.send(transfer(args[0]), Constant.UPDATE);
		} else if (methodName.equals("delete")) {
			logger.info("发送用户信息，类型：delete");
			this.subSysFuncProducer.send(transfer(args[0]), Constant.DELETE);
		}
	}

	/**
	 * 对象转换
	 * 
	 * @param arg
	 * @return
	 */
	private SubSysFunc transfer(Object arg) {

		SubSysFunc user = new SubSysFunc();
		user.setAppid(ParseObjectUtils.getFieldValueByName("appid", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("appid", arg));
		user.setChfuncmid(ParseObjectUtils.getFieldValueByName("chfuncmid", arg) == null ? 0
				: (Long) ParseObjectUtils.getFieldValueByName("chfuncmid", arg));
		user.setFunccode(ParseObjectUtils.getFieldValueByName("funccode", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("funccode", arg));
		user.setFuncdesc(ParseObjectUtils.getFieldValueByName("funcdesc", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("funcdesc", arg));
		user.setFuncnamech(ParseObjectUtils.getFieldValueByName("funcnamech", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("funcnamech", arg));
		user.setFuncnameen(ParseObjectUtils.getFieldValueByName("funcnameen", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("funcnameen", arg));
		user.setFuncurl(ParseObjectUtils.getFieldValueByName("funcurl", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("funcurl", arg));
		user.setIcon(ParseObjectUtils.getFieldValueByName("icon", arg) == null ? null
				: (byte[]) ParseObjectUtils.getFieldValueByName("icon", arg));
		user.setIsapp(ParseObjectUtils.getFieldValueByName("isapp", arg) == null ? "0"
				: (String) ParseObjectUtils.getFieldValueByName("isapp", arg));
		user.setIsmenu(ParseObjectUtils.getFieldValueByName("ismenu", arg) == null ? 0
				: (Short) ParseObjectUtils.getFieldValueByName("ismenu", arg));
		user.setParentid(ParseObjectUtils.getFieldValueByName("parentid", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("parentid", arg));
		user.setPriority(ParseObjectUtils.getFieldValueByName("priority", arg) == null ? 0
				: (Long) ParseObjectUtils.getFieldValueByName("priority", arg));
		user.setId(ParseObjectUtils.getFieldValueByName("id", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("id", arg));
		return user;
	}

	public void setSubSysFuncProducer(SubSysFuncProducer subSysFuncProducer) {
		this.subSysFuncProducer = subSysFuncProducer;
	}

}
