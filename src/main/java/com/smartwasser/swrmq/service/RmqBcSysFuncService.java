package com.smartwasser.swrmq.service;

import java.util.List;

import com.smartwasser.swrmq.dao.RmqBcSysFuncMapper;
import com.smartwasser.swrmq.model.BcSysFunc;
import com.smartwasser.swrmq.model.BcSysFuncExample;

/**
 * 
 * <p>RmqBcSysFuncService</p>
 * <p>@description: 功能模块表操作</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月22日 上午10:34:30</p>
 */
public class RmqBcSysFuncService extends BaseService {
	
	private RmqBcSysFuncMapper mapper;
	
	public List<BcSysFunc> getList(BcSysFuncExample example) {
		return this.mapper.selectByExample(example);
	}

	public void save(BcSysFunc record) {
		this.mapper.insert(record);
	}

	public BcSysFunc getById(String id) {
		BcSysFuncExample example = new BcSysFuncExample();
		example.createCriteria().andIdEqualTo(id);
		List<BcSysFunc> list = this.mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public void update(BcSysFunc record, BcSysFuncExample example) {
		this.mapper.updateByExample(record, example);
	}

	public void delete(String id) {
		BcSysFuncExample example = new BcSysFuncExample();
		example.createCriteria().andIdEqualTo(id);
		this.mapper.deleteByExample(example);
	}

	public RmqBcSysFuncMapper getMapper() {
		return mapper;
	}

	public void setMapper(RmqBcSysFuncMapper mapper) {
		this.mapper = mapper;
	}

}
