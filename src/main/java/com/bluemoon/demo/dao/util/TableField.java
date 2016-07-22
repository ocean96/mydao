package com.bluemoon.demo.dao.util;

public class TableField<T> {
	private final StringBuilder table;
	private final StringBuilder name;
	private T value;

	public TableField(String table, String name) {
		this.table = new StringBuilder(table);
		this.name = new StringBuilder(name);
	}

	public String getTable() {
		return table.toString();
	}

	public String getName() {
		return name.toString();
	}

	public T getValue() {
		return value;
	}
	
	public String toString() {
		return this.name.toString();
	}	
	
	/**
	 * @Title:equest
	 * @Desciption:TODO	参数等于值
	 * @param @param value
	 * @param @return
	 * @return String
	 * @param value
	 * @return
	 */
	public String equest(String value) {
		return this.name.append(Keyword.EQUALS).append(value).toString();
	}
	
	/**
	 * @Title:like
	 * @Desciption:TODO 参数like值
	 * @param @param value
	 * @param @return
	 * @return String
	 * @param value
	 * @return
	 */
	public String like(String value) {
		return this.name.append(Keyword.LIKE).append(value).toString();
	}
	
	/**
	 * @Title:less
	 * @Desciption:TODO 参数小于值
	 * @param @param value
	 * @param @return
	 * @return String
	 * @param value
	 * @return
	 */
	public String less(String value) {
		return this.name.append(Keyword.LESS).append(value).toString();
	}
	
	/**
	 * @Title:greater
	 * @Desciption:TODO 参数大于值
	 * @param @param value
	 * @param @return
	 * @return String
	 * @param value
	 * @return
	 */
	public String greater(String value) {
		return this.name.append(Keyword.GREATER).append(value).toString();
	}
	
}
