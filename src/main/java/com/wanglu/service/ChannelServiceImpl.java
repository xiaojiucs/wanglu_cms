package com.wanglu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanglu.dao.ChannelMapper;
import com.wanglu.bean.Channel;
import com.wanglu.service.ChannelService;

/**
 * 
 * @author wanglu
 *
 */

@Service
public class ChannelServiceImpl  implements ChannelService{
	
	@Autowired
	ChannelMapper channelMapper;

	public List<Channel> list() {
		// TODO Auto-generated method stub
		return channelMapper.list();
	}

}
