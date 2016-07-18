package com.bluemoon.demo.dao.util;

import java.util.Date;
import java.util.List;

public class Condition<T> {

	private List<String> conditions; // 参数

	public List<String> getConditions() {
		return conditions;
	}

	public void setConditions(List<String> conditions) {
		this.conditions = conditions;
	}

	public Condition equal(String param) {
		return this;
	}
	
	public Condition equal(Date param) {
		return this;
	}
	
	public Condition equal(Integer param) {
		return this;
	}
	
	public Condition equal(Boolean param) {
		
		return this;
	}
}
