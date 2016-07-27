package com.smartwasser.swrmq.service;

import java.util.List;

import com.smartwasser.swrmq.dao.RmqMessageSendTaskMapper;
import com.smartwasser.swrmq.model.MessageSendTask;
import com.smartwasser.swrmq.model.MessageSendTaskExample;

public class MessageSendTaskService {
	
	private RmqMessageSendTaskMapper mapper;
	
	public List<MessageSendTask> getList(MessageSendTaskExample example) {
		return this.mapper.selectByExample(example);
	}

	public void save(MessageSendTask record) {
		this.mapper.insert(record);
	}

	public MessageSendTask getById(String id) {
		MessageSendTaskExample example = new MessageSendTaskExample();
		example.createCriteria().andDataIdEqualTo(id);
		List<MessageSendTask> list = this.mapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public void update(MessageSendTask record, MessageSendTaskExample example) {
		this.mapper.updateByExample(record, example);
	}

	public void delete(String id) {
		MessageSendTaskExample example = new MessageSendTaskExample();
		example.createCriteria().andDataIdEqualTo(id);
		this.mapper.deleteByExample(example);
	}

	public RmqMessageSendTaskMapper getMapper() {
		return mapper;
	}

	public void setMapper(RmqMessageSendTaskMapper mapper) {
		this.mapper = mapper;
	}

}
