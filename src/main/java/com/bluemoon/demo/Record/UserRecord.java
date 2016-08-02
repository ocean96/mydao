package com.bluemoon.demo.Record;

import java.util.Date;

import com.bluemoon.demo.util.TableField;

public class UserRecord {
	
	private UserRecord(){}

	public static final UserRecord USER = new UserRecord();

	public final TableField<String> USER_ID = new TableField<String>("t_user", "user_id");

	public final TableField<String> USER_NAME = new TableField<String>("t_user", "user_name");

	public final TableField<String> USER_PASSWORD = new TableField<String>("t_user", "user_password");
	public final TableField<String> ROLE_ID = new TableField<String>("t_user", "role_id");
	public final TableField<Date> USER_LOGIN_TIME = new TableField<Date>("t_user", "user_login_time");
	public final TableField<String> USER_MAC = new TableField<String>("t_user", "user_mac");

	public static UserRecord getUser() {
		return USER;
	}

	public TableField<String> getUSER_ID() {
		return USER_ID;
	}

	public TableField<String> getUSER_NAME() {
		return USER_NAME;
	}

	public TableField<String> getUSER_PASSWORD() {
		return USER_PASSWORD;
	}

	public TableField<String> getROLE_ID() {
		return ROLE_ID;
	}


	public TableField<Date> getUSER_LOGIN_TIME() {
		return USER_LOGIN_TIME;
	}

	public TableField<String> getUSER_MAC() {
		return USER_MAC;
	}

}
