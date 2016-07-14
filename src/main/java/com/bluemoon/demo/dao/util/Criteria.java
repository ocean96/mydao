package com.bluemoon.demo.dao.util;

import java.util.List;

public class Criteria<T> {
	public T where; // 条件
	public List<Sort> sort; // order by 参数
	public Integer offset; // 数据便宜
	public Integer size; // 数据容量

	public T getWhere() {
		return where;
	}

	public void setWhere(T where) {
		this.where = where;
	}

	public List<Sort> getSort() {
		return sort;
	}

	public void setSort(List<Sort> sort) {
		this.sort = sort;
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

}