package com.wanglu.dao;

import java.util.List;

import com.wanglu.bean.Category;

public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	

}
