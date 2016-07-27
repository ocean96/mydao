package com.bluemoon.demo.controller;

import static com.bluemoon.demo.Record.UserRecord.USER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bluemoon.demo.dao.Select;
import com.bluemoon.demo.model.User;
import com.bluemoon.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public User getUser() {
		Select<User> select = new Select<User>(User.class);
		User userInfo = (User) select
				.where(USER.USER_NAME.equest("wenlong"))
				.where(USER.USER_ID.greater("1"))
				.orderBy(USER.USER_NAME.asc())
				.fetch();
		return userInfo;
	}
}
