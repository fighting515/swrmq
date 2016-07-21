package com.smartwasser.swrmq.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * <p>BaseService</p>
 * <p>@description: TODO</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月21日 下午1:43:06</p>
 */
@Transactional(value = "swrmq", rollbackFor = Exception.class)
public abstract class BaseService {
	
}
