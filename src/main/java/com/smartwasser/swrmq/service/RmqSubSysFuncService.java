package com.smartwasser.swrmq.service;

import java.util.List;

import com.smartwasser.swrmq.dao.RmqSubSysFuncMapper;
import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.model.SubSysFuncExample;

/**
 * 
 * <p>RmqSubSysFuncService</p>
 * <p>@description: 功能模块表操作</p>
 * <p>@author: chenhao</p>
 * <p>@date: 2016年7月22日 上午10:34:30</p>
 */
public class RmqSubSysFuncService extends BaseService {
	
	private RmqSubSysFuncMapper mapper;
	
	public List<SubSysFunc> getList(SubSysFuncExample example) {
		return this.mapper.selectByExample(example);
	}

	public void save(SubSysFunc record) {
		this.mapper.insert(record);
	}

	public SubSysFunc getById(String id) {
		SubSysFuncExample example = new SubSysFuncExample();
		example.createCriteria().andIdEqualTo(id);
		List<SubSysFunc> list = this.mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public void update(SubSysFunc record, SubSysFuncExample example) {
		this.mapper.updateByExample(record, example);
	}

	public void delete(String id) {
		SubSysFuncExample example = new SubSysFuncExample();
		example.createCriteria().andIdEqualTo(id);
		this.mapper.deleteByExample(example);
	}

	public RmqSubSysFuncMapper getMapper() {
		return mapper;
	}

	public void setMapper(RmqSubSysFuncMapper mapper) {
		this.mapper = mapper;
	}

}
