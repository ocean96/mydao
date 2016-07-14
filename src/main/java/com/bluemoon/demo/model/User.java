package com.bluemoon.demo.model;

public class User {
	private String userId;
	private String userName;
	private String userPassword;
	private String roleId;
	private String userLoginTime;
	private String userMac;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getUserLoginTime() {
		return userLoginTime;
	}

	public void setUserLoginTime(String userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	public String getUserMac() {
		return userMac;
	}

	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}

}