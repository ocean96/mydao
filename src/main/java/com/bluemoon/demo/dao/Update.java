package com.bluemoon.demo.dao;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bluemoon.demo.dao.util.Condition;
import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.dao.util.Set;
import com.bluemoon.demo.dao.util.TableField;

public class Update<T> {
	private String beanDao;
	private Criteria<T> criteria;
	
	protected Update(Class<T> clazz) {
		this.criteria = new Criteria<T>();
		this.beanDao = clazz.getSimpleName().toLowerCase() + "Dao";
	}
	
	public Update<T> set(TableField row, String value) {
		Set set = new Set();
		set.setParam(row.getName());
		set.setValue(value);
		criteria.addSet(set);
		return this;
	}
	
	public Update<T> where(Condition condition) {
		criteria.addCondition(condition);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public Integer update(){
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		SuperDao<T> superDao = (SuperDao<T>)wac.getBean(beanDao);
		Integer index = (Integer)superDao.update(criteria);
	 	return index;
	}
}
