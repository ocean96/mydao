package com.bluemoon.demo.dao.util;

/**
 * <p>Title:NameChange</p>
 * <p>Description: 类与数据库名称转换类</p>
 * @author ocean
 * @since 2016年7月19日 上午9:50:27
 */
public class NameChange {
	/**
	 * @Title:nameToDbRow
	 * @Desciption:TODO	把属性名转换成数据库行名
	 * @param @param name
	 * @param @return
	 * @return String
	 * @param name
	 * @return
	 */
	public String nameToDbRow(String name) {
		name = name.trim();
		String dbRow = name.replaceAll("[A-Z]", "_$0");
		dbRow = dbRow.toLowerCase();
		return dbRow;
	}
	
	/**
	 * @Title:dbRowToName
	 * @Desciption:TODO 把数据库行名转换成属性名
	 * @param @param dbRow
	 * @param @return
	 * @return String
	 * @param dbRow
	 * @return
	 */
	public String dbRowToName(String dbRow) {
		dbRow = dbRow.trim();
		for(int flag = dbRow.indexOf("_"); flag > 0; flag = dbRow.indexOf("_")) {
			String temp = String.valueOf(dbRow.charAt(flag + 1)).toUpperCase();
			dbRow = dbRow.replaceFirst("_[a-z]", temp);
		}
		return dbRow;
	}
	
	/**
	 * @Title:tableName
	 * @Desciption:TODO 类名转换成数据库表名
	 * @param @param className
	 * @param @return
	 * @return String
	 * @param className
	 * @return
	 */
	public String tableName(String className) {
		className = className.trim();
		String tableName = className.replaceAll("[A-Z]", "_$0").toLowerCase();
		tableName = tableName.substring(tableName.indexOf("_") + 1);
		return tableName;
	}
	
	public static void main(String[] args) {
		NameChange test = new NameChange();
		System.out.println(test.tableName("WenLong"));
	}
}