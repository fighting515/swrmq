package com.smartwasser.swrmq.service;

import java.util.List;
import java.util.Map;

import com.smartwasser.swrmq.dao.RmqClientSysUserMapper;
import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.model.ClientSysUserExample;
/**
 * 
 * <p>RmqClientSysUserService</p>
 * <p>@description: 用户信息表操作</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月21日 下午1:43:29</p>
 */
public class RmqClientSysUserService extends BaseService{

	private RmqClientSysUserMapper mapper;
	
	public List<ClientSysUser> getList(ClientSysUserExample example) {
		return this.mapper.selectByExample(example);
	}

	public void save(ClientSysUser record) {
		this.mapper.insert(record);
	}

	public ClientSysUser getById(String id) {
		ClientSysUserExample example = new ClientSysUserExample();
		example.createCriteria().andIdEqualTo(id);
		List<ClientSysUser> list = this.mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public void update(ClientSysUser record, ClientSysUserExample example) {
		this.mapper.updateByExample(record, example);
	}

	public void delete(String id) {
		ClientSysUserExample example = new ClientSysUserExample();
		example.createCriteria().andIdEqualTo(id);
		this.mapper.deleteByExample(example);
	}

	public RmqClientSysUserMapper getMapper() {
		return mapper;
	}

	public void setMapper(RmqClientSysUserMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<Map<String,String>> selectUserSchema(String username){
		return this.mapper.selectUserSchema(username);
	}
}
