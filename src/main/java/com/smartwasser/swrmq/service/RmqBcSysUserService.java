package com.smartwasser.swrmq.service;

import java.util.List;

import com.smartwasser.swrmq.dao.RmqBcSysUserMapper;
import com.smartwasser.swrmq.model.BcSysUser;
import com.smartwasser.swrmq.model.BcSysUserExample;
/**
 * 
 * <p>RmqBcSysUserService</p>
 * <p>@description: </p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月21日 下午1:43:29</p>
 */
public class RmqBcSysUserService extends BaseService{

	private RmqBcSysUserMapper mapper;
	
	public List<BcSysUser> getList(BcSysUserExample example) {
		return this.mapper.selectByExample(example);
	}

	public void save(BcSysUser record) {
		this.mapper.insert(record);
	}

	public BcSysUser getById(String id) {
		BcSysUserExample example = new BcSysUserExample();
		example.createCriteria().andIdEqualTo(id);
		List<BcSysUser> list = this.mapper.selectByExample(example);
		return list == null ? null : list.get(0);
	}

	public void update(BcSysUser record, BcSysUserExample example) {
		this.mapper.updateByExample(record, example);
	}

	public void delete(String id) {
		BcSysUserExample example = new BcSysUserExample();
		example.createCriteria().andIdEqualTo(id);
		this.mapper.deleteByExample(example);
	}

	public RmqBcSysUserMapper getMapper() {
		return mapper;
	}

	public void setMapper(RmqBcSysUserMapper mapper) {
		this.mapper = mapper;
	}
	
}
