package com.bluemoon.demo.dao;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bluemoon.demo.dao.util.Condition;
import com.bluemoon.demo.dao.util.Criteria;

public class Delete<T> {
	private String beanDao;
	private Criteria<T> criteria = new Criteria<T>();	//参数表
	protected Delete(Class<T> clazz) {
		beanDao = clazz.getSimpleName().toLowerCase() + "Dao";
	}
	
	public Delete<T> where(Condition condition) {
		criteria.addCondition(condition);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public Integer delete(){
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		SuperDao<T> superDao = (SuperDao<T>)wac.getBean(beanDao);
		Integer index = (Integer)superDao.delete(criteria);
	 	return index;
	}
	
}
