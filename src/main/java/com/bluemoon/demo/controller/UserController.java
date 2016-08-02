package com.bluemoon.demo.controller;

import static com.bluemoon.demo.Record.UserRecord.USER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluemoon.demo.Delete;
import com.bluemoon.demo.Insert;
import com.bluemoon.demo.SQLFactory;
import com.bluemoon.demo.Select;
import com.bluemoon.demo.Update;
import com.bluemoon.demo.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public User getUser() {
		Select<User> select = SQLFactory.getInstance().getSelectBean(User.class);
		User userInfo = (User) select
				.where(USER.USER_NAME.equest("wenlong"))
				.where(USER.USER_ID.greater("1"))
				.orderBy(USER.USER_NAME.asc())
				.select();
		return userInfo;
	}
	
	@ResponseBody
	@RequestMapping(value="/addUser", method = RequestMethod.POST) 
	public Integer addUser() {
		Insert<User> insert = SQLFactory.getInstance().getInsertBean(User.class);
		Integer index = (Integer) insert
				.value(USER.USER_ID, "1234")
				.value(USER.USER_NAME, "WENLONG")
				.value(USER.USER_PASSWORD, "1234567854321")
				.insert();
		return index;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateUser", method = RequestMethod.POST)
	public Integer updateUser() {
		Update<User> update = SQLFactory.getInstance().getUpdateBean(User.class);
		Integer index = (Integer) update
				.set(USER.ROLE_ID, "3")
				.set(USER.USER_MAC, "PC")
				.where(USER.USER_ID.equest("2"))
				.update();
		return index;
	}
	
	@ResponseBody
	@RequestMapping(value="/deleteUser", method = RequestMethod.POST)
	public Integer deleteUser() {
		Delete<User> delete = SQLFactory.getInstance().getDeleteBean(User.class);
		Integer index = delete
				.where(USER.USER_ID.equest("1234"))
				.delete();
		return index;
	}
}
