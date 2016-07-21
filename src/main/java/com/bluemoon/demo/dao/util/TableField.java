package com.bluemoon.demo.dao.util;

public class TableField<T> {
	private final String table;
	private final String name;
	private T value;

	public TableField(String table, String name) {
		this.table = table;
		this.name = name;
	}

	public String getTable() {
		return table;
	}

	public String getName() {
		return name;
	}

	public T getValue() {
		return value;
	}
	
	public String toString() {
		return this.name;
	}	
	
	
}
