package com.bluemoon.demo.dao;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.dao.util.TableField;

public class Insert<T> {
	private String beanDao;
	private Criteria<T> criteria;
	
	protected Insert(Class<T> clazz) {
		this.criteria = new Criteria<T>();
		this.beanDao = clazz.getSimpleName().toLowerCase() + "Dao";
	}
	
	public Insert<T> value(TableField row, String value) {
		criteria.addRow(row.getName());
		criteria.addValue(value);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public Integer insert(){
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		SuperDao<T> superDao = (SuperDao<T>)wac.getBean(beanDao);
		Integer index = (Integer)superDao.insert(criteria);
	 	return index;
	}
}
