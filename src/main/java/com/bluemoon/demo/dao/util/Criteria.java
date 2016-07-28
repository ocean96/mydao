package com.bluemoon.demo.dao.util;

import java.util.ArrayList;
import java.util.List;

public class Criteria<T> {
	private List<Condition> conditionList; // 条件
	private List<Sort> sortList; // order by 参数
	private Integer offset; // 数据偏量
	private Integer size; // 数据容量
	private Boolean distinct; // 标识时间
	private List<String> select; // 查询字段
	private Integer top; // 限制返回数目
	private List<String> groupByList; // 分组
	private List<String> rowList;	//列
	private List<String> valueList;	//元素
	private List<Set> setList;

	public void addSet(Set set) {
		if(setList == null) {
			setList = new ArrayList<Set>();
		}
		setList.add(set);
	}
	
	public List<Set> getSetList() {
		return setList;
	}

	public void addRow(String row) {
		if(rowList == null) {
			rowList = new ArrayList<String>();
		}
		rowList.add(row);
	}
	
	public List<String> getRowList() {
		return rowList;
	}

	public void addValue(String value) {
		if(valueList == null) {
			valueList = new ArrayList<String>();
		}
		valueList.add(value);
	}
	
	public List<String> getValueList() {
		return valueList;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Boolean getDistinct() {
		return distinct;
	}

	public void setDistinct(Boolean distinct) {
		this.distinct = distinct;
	}

	public List<Condition> getConditionList() {
		return conditionList;
	}

	public void addCondition(Condition condition) {
		if (conditionList == null) {
			conditionList = new ArrayList<Condition>();
		}
		conditionList.add(condition);
	}

	public List<Sort> getSortList() {
		return sortList;
	}

	public void addSort(Sort sort) {
		if (sortList == null) {
			sortList = new ArrayList<Sort>();
		}
		sortList.add(sort);
	}

	public List<String> getSelect() {
		return select;
	}

	public void setSelect(List<String> select) {
		this.select = select;
	}

	public Integer getTop() {
		return top;
	}

	public void setTop(Integer top) {
		this.top = top;
	}

	public List<String> getGroupByList() {
		return groupByList;
	}

	public void addGroupBy(String groupBy) {
		if (groupByList == null) {
			groupByList = new ArrayList<String>();
		}
		groupByList.add(groupBy);
	}
}