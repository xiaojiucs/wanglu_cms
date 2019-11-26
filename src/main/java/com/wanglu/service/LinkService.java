package com.wanglu.service;

import javax.validation.Valid;

import com.github.pagehelper.PageInfo;
import com.wanglu.bean.Link;

/**
 * 
 * @author wanglu
 *
 */
public interface LinkService {

	int add(Link link);
	PageInfo list(int page);
	int delete(int id);
	Link get(int id);
	int update( Link link);

}
