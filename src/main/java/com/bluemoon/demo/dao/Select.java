package com.bluemoon.demo.dao;

import java.util.List;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bluemoon.demo.dao.util.Condition;
import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.dao.util.Sort;

public class Select<T> {
	private String beanDao;
	private Criteria<T> criteria = new Criteria<T>(); // 参数表

	protected Select(Class<T> clazz) {
		beanDao = clazz.getSimpleName().toLowerCase() + "Dao";
	}

	public Select<T> where(Condition condition) {
		criteria.addCondition(condition);
		return this;
	}

	public Select<T> orderBy(Sort sort) {
		criteria.addSort(sort);
		return this;
	}

	public Select<T> distinct() {
		criteria.setDistinct(true);
		return this;
	}

	public Select<T> top(Integer top) {
		criteria.setTop(top);
		return this;
	}

	public Select<T> groupBy(String groupBy) {
		criteria.addGroupBy(groupBy);
		return this;
	}

	@SuppressWarnings("unchecked")
	public List<T> selectList() {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		SuperDao<T> superDao = (SuperDao<T>) wac.getBean(beanDao);
		List<T> beanInfo = (List<T>) superDao.selectList(criteria);
		return beanInfo;
	}

	public T select() {
		return null;
	}

}