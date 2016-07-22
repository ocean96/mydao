package com.bluemoon.demo.dao;

import com.bluemoon.demo.dao.util.Condition;
import com.bluemoon.demo.dao.util.Criteria;

public class Select<T> {
	private String table = "";
	private Criteria criteria = new Criteria();	//参数表
	private Condition condition = new Condition();	//where参数
	Select(T object) {
		table = object.getClass().getName();	//获取实体类名称
	}
	
	public Select where(Condition condition) {
		criteria.setCondition(condition);
		return this;
	}
	
	public Select orderBy() {
		return this;
	}
}