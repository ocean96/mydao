package com.bluemoon.demo.dao.util;

import java.util.List;

public class Criteria<T> {
	private Condition condition; // 条件
	private List<String> sort; // order by 参数
	// private Integer offset; // 数据偏量
	// private Integer size; // 数据容量
	// private Boolean distinct; //标识时间
	private List<String> select; // 查询字段

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public List<String> getSort() {
		return sort;
	}

	public void setSort(List<String> sort) {
		this.sort = sort;
	}

	public List<String> getSelect() {
		return select;
	}

	public void setSelect(List<String> select) {
		this.select = select;
	}

}