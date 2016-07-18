package com.bluemoon.demo.dao.util;

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
	
	public String dbRowToName(String dbRow) {
		dbRow = dbRow.trim();
		String[] dbRow.split("_");
		return null;
	}
	
	public String tableName(String className) {
		className = className.trim();
		return null;
	}
	
	public static void main(String[] args) {
		NameChange test = new NameChange();
		System.out.println(test.dbRowToName("wen_long_ocean"));
	}
}