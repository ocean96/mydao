package com.bluemoon.demo.Record;

import com.bluemoon.demo.dao.util.TableField;

public class UserRecord {
	
	private final static UserRecord USER = new UserRecord();
	
	private final static TableField<Long> ID = new TableField<Long>("author", "id");
	
	private final static TableField<String> FIRST_NAME = new TableField<String>("author", "first_name");
	
	private final static TableField<String> LAST_NAME = new TableField<String>("author", "last_name");
	
	
	public static TableField<Long> getId() {
		return ID;
	}



	public static TableField<String> getFirstName() {
		return FIRST_NAME;
	}



	public static TableField<String> getLastName() {
		return LAST_NAME;
	}

	public static void main(String[] args) {
		 System.out.println(USER.LAST_NAME);
	}
	
}
