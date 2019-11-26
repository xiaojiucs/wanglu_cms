package com.wanglu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanglu.dao.LinkMapper;
import com.wanglu.bean.Link;
import com.wanglu.service.LinkService;

/**
 * 
 * @author wanglu
 *
 */
@Service
public class LinkServiceImpl  implements LinkService{
	
	@Autowired
	LinkMapper linkMapper;

	
	public int add(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.add(link);
		
	}

	
	public PageInfo list(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,10);
		
		return new PageInfo<Link>(linkMapper.list());
	}

	
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linkMapper.delete(id);
	}

	
	public Link get(int id) {
		// TODO Auto-generated method stub
		return linkMapper.get(id);
	}

	
	public int update(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.update(link);
		
	}

}
