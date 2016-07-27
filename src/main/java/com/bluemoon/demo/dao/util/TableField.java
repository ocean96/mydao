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
	 * @return Condition
	 * @param value
	 * @return
	 */
	public Condition equest(String value) {
		Condition condition = new Condition();
		condition.setCommand(this.name + Keyword.EQUALS);
		condition.setValue(value);
//		condition.add(this.name.append(Keyword.EQUALS).append(value).toString());
		return condition;
	}
	
	/**
	 * @Title:like
	 * @Desciption:TODO 参数like值
	 * @param @param value
	 * @param @return
	 * @return Condition
	 * @param value
	 * @return
	 */
	public Condition like(String value) {
		Condition condition = new Condition();
		condition.setCommand(this.name + Keyword.LIKE);
		condition.setValue(value);
		return condition;
	}
	
	/**
	 * @Title:less
	 * @Desciption:TODO 参数小于值
	 * @param @param value
	 * @param @return
	 * @return Condition
	 * @param value
	 * @return
	 */
	public Condition less(String value) {
		Condition condition = new Condition();
		condition.setCommand(this.name + Keyword.LESS);
		condition.setValue(value);
		return condition;
	}
	
	/**
	 * @Title:greater
	 * @Desciption:TODO 参数大于值
	 * @param @param value
	 * @param @return
	 * @return Condition
	 * @param value
	 * @return
	 */
	public Condition greater(String value) {
		Condition condition = new Condition();
		condition.setCommand(this.name + Keyword.GREATER);
		condition.setValue(value);
		return condition;
	}
	
	/**
	 * @Title:between
	 * @Desciption:TODO between,value1为小值,value2为较大值
	 * @param @param value1
	 * @param @param value2
	 * @param @return
	 * @return Condition
	 * @param value1
	 * @param value2
	 * @return
	 */
	public Condition between(String value1, String value2) {
		Condition condition = new Condition();
		condition.setCommand(this.name + Keyword.BETWEEN + value1 + Keyword.AND + value2);
		return condition;
	}
	
	/**
	 * @Title:asc
	 * @Desciption:TODO orderBy升序
	 * @param @return
	 * @return OrderBy
	 * @return
	 */
	public Sort asc() {
		Sort sort = new Sort();
		sort.setName(getName());
		sort.setType(Keyword.ASC);
		return sort;
	}
	
	/**
	 * @Title:desc
	 * @Desciption:TODO orderBy降序
	 * @param @return
	 * @return OrederBy
	 * @return
	 */
	public Sort desc() {
		Sort sort = new Sort();
		sort.setName(getName());
		sort.setType(Keyword.DESC);
		return sort;
	}
	
}
