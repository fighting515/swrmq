package com.smartwasser.swrmq.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAspect {
	
	private Logger logger = LoggerFactory.getLogger(MyAspect.class);

	/**
	 * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
	 */
	public void aspect(){
		logger.info("this is myaspect's aspect method");
	}
	
	/**
	 * 前置通知
	 * @param joinPoint
	 */
	public void before(JoinPoint joinPoint){
		logger.info("this is myaspect's before method");
	}
	
	/**
	 * 后置通知
	 * @param joinPoint
	 */
	public void after(JoinPoint joinPoint){
		logger.info("this is myaspect's after method");
	}
	
	/**
	 * 环绕通知
	 * @param joinPoint
	 */
	public void around(JoinPoint joinPoint){
		logger.info("this is myaspect's around method");
	}
	
	/**
	 * 后置返回通知
	 * @param joinPoint
	 */
	public void afterReturn(JoinPoint joinPoint){
		logger.info("this is myaspect's afterReturn method");
	}
	
	/**
	 * 抛出异常后通知
	 * @param joinPoint
	 * @param ex
	 */
	public void afterThrow(JoinPoint joinPoint, Exception ex){
		logger.info("this is myaspect's afterThrow method");
	}
	
}
