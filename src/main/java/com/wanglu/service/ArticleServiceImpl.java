package com.wanglu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanglu.common.ConstantClass;
import com.wanglu.dao.ArticleMapper;
import com.wanglu.bean.Article;
import com.wanglu.bean.Comment;
import com.wanglu.service.ArticleService;

/**
 * 
 * @author wanglu
 *
 */
@Service
public class ArticleServiceImpl  implements ArticleService{
	
	@Autowired
	ArticleMapper articleMapper;
	

	
	public List<Article> getNewArticles(int i) {
		// TODO Auto-generated method stub
		return articleMapper.newList(i);
	}

	
	public PageInfo<Article> hotList(int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.hostList());
		
	}

	
	public Article getById(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.getById(id);
	}

	
	public PageInfo<Article> listByCat(int chnId, int categoryId, int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.listByCat(chnId,categoryId));
	}

	
	public PageInfo<Article> listByUser(int page,Integer userId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.listByUser(userId));
	
	}

	
	public int delete(int id) {
		// TODO Auto-generated method stub
		return articleMapper.delete(id);
	}

	/* (non Javadoc) 
	 * @Title: checkExist
	 * @Description: TODO
	 * @param id
	 * @return 
	 * @see com.wanglu.service.ArticleService#checkExist(int) 
	 */
	
	public Article checkExist(int id) {
		// TODO Auto-generated method stub
		return  articleMapper.checkExist(id);
	}

	/* (non Javadoc) 
	 * @Title: getPageList
	 * @Description: TODO
	 * @param status
	 * @param page
	 * @return 
	 * @see com.wanglu.service.ArticleService#getPageList(int, java.lang.Integer) 
	 */
	
	public PageInfo<Article> getPageList(int status, Integer page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(articleMapper.listByStatus(status));
	}

	
	public Article getDetailById(int id) {
		// TODO Auto-generated method stub
		return  articleMapper.getDetailById(id);
	}

	
	public int apply(int id, int status) {
		// TODO Auto-generated method stub
		return articleMapper.apply(id,status);
	}

	
	
	public int setHot(int id, int status) {
		// TODO Auto-generated method stub
		return articleMapper.setHot(id,status);
	}

	
	public int add(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.add(article);
	}

	
	public int update(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.update(article);
	}

	
	public int faverite(Integer userId, int articleId) {
		// TODO Auto-generated method stub
		return articleMapper.favorite(userId,articleId);
	}

	
	public List<Article> getImgArticles(int num) {
		// TODO Auto-generated method stub
		return articleMapper.getImgArticles(num);
	}

	
	public int comment(Integer userId, int articleId, String content) {
		// TODO Auto-generated method stub
		
		//插入评论表一条数据
		int result = articleMapper.addComment(userId, articleId, content);
		if(result>0) {
			// 让文章表中的评论数量自增1
			articleMapper.increaseCommentCnt(articleId);
		}else {
			return 0;
		}
		return result;
		
	}

	
	public PageInfo<Comment> commentlist(int articleId, int page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,10);
		
		return new PageInfo<Comment>(articleMapper.commentlist(articleId));
	}

}
