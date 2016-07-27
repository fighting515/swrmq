package com.smartwasser.swrmq.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.producer.ClientSysUserProducer;
import com.smartwasser.swrmq.util.Constant;
import com.smartwasser.swrmq.util.ParseObjectUtils;

/**
 * 
 * <p>
 * UserControllerAspect
 * </p>
 * <p>
 * @description: userController的切面，在用户信息添加、修改、删除操作执行成功后，同步将消息下发到各子系统
 * </p>
 * <p>
 * @author: chenhao
 * </p>
 * <p>
 * @date: 2016年7月23日 上午12:40:51
 * </p>
 */
public class UserControllerAspect extends MyAspect {

	private Logger logger = LoggerFactory.getLogger(UserControllerAspect.class);
	private ClientSysUserProducer clientSysUserProducer;

	@Override
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		if (methodName.equals("save")) {
			logger.info("发送用户信息，类型：insert");
			this.clientSysUserProducer.send(transfer(args[0]), Constant.INSERT);
		} else if (methodName.equals("update")) {
			logger.info("发送用户信息，类型：update");
			this.clientSysUserProducer.send(transfer(args[0]), Constant.UPDATE);
		} else if (methodName.equals("delete")) {
			logger.info("发送用户信息，类型：delete");
			this.clientSysUserProducer.send(transfer(args[0]), Constant.DELETE);
		}
	}

	/**
	 * 对象转换
	 * 
	 * @param arg
	 * @return
	 */
	private ClientSysUser transfer(Object arg) {
		ClientSysUser user = new ClientSysUser();
		user.setEmail(ParseObjectUtils.getFieldValueByName("email", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("email", arg));
		user.setId(ParseObjectUtils.getFieldValueByName("id", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("id", arg));
		user.setPassword(ParseObjectUtils.getFieldValueByName("password", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("password", arg));
		user.setState(ParseObjectUtils.getFieldValueByName("state", arg) == null ? "0"
				: (String) ParseObjectUtils.getFieldValueByName("state", arg));
		user.setSuperAdminFlag(ParseObjectUtils.getFieldValueByName("superAdminFlag", arg) == null ? "0"
				: (String) ParseObjectUtils.getFieldValueByName("superAdminFlag", arg));
		user.setUsername(ParseObjectUtils.getFieldValueByName("username", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("username", arg));
		user.setUsernamecn(ParseObjectUtils.getFieldValueByName("usernamecn", arg) == null ? null
				: (String) ParseObjectUtils.getFieldValueByName("usernamecn", arg));
		return user;
	}

	public void setClientSysUserProducer(ClientSysUserProducer clientSysUserProducer) {
		this.clientSysUserProducer = clientSysUserProducer;
	}

}
