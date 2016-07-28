package com.bluemoon.demo.dao;

public class SQLFactory {
	
	private static SQLFactory factory;
	
	private SQLFactory() {}

	public static SQLFactory getInstance() {
		if(factory == null) {
			return new SQLFactory();
		}
		return factory;
	}
	
	public <T> Select<T> getSelectBean(Class<T> clazz) {
		return new Select<T>(clazz);
	}
	
	public <T> Insert<T> getInsertBean(Class<T> clazz) {
		return new Insert<T>(clazz);
	}
	
	public <T> Update<T> getUpdateBean(Class<T> clazz) {
		return new Update<T>(clazz);
	}
	
	public <T> Delete<T> getDeleteBean(Class<T> clazz) {
		return new Delete<T>(clazz);
	}
}
