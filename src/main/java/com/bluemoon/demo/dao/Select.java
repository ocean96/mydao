package com.bluemoon.demo.dao;

public class Select<T> {
	private String table = "";
	Select(T object) {
		table = object.getClass().getName();	//获取实体类名称
	}
	
	public Select where(Condition condition) {
		
		return this;
	}
//	public <T>
}