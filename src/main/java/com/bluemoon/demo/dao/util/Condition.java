package com.bluemoon.demo.dao.util;

import java.util.List;

import com.bluemoon.demo.model.User;

public class Condition<T> {

	private List<String> conditions; // 参数

	public List<String> getConditions() {
		return conditions;
	}

	public Condition whereEqual(String param, String value) {
		String where = param + "=" + value;
		conditions.add(where);
		return this;
	}
	
	public Condition whereGreater(String param, String value) {
		String where = param + "&gt;" + value;
		conditions.add(where);
		return this;
	}
	
	public Condition whereLess(String param, String value) {
		String where = param + "&lt;" + value;
		conditions.add(where);
		return this;
	}
	
	public Condition whereBetween(String param, String value1, String value2) {
		String where = param + "BETWEEN" + value1 + "AND" + value2;
		conditions.add(where);
		return this;
	}
	
	public static void main(String[] args) {
		Condition<User> user = new Condition<User>();
		
	}
}