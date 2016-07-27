package com.bluemoon.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bluemoon.demo.dao.UserDao;
import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.model.User;
import com.bluemoon.demo.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	/**
	 * @Title:getUser
	 * @Desciption:TODO 获取用户信息
	 * @param @param criteria
	 * @param @return
	 * @return User
	 * @param criteria
	 * @return
	 */
	public User getUser(Criteria<User> criteria) {
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		UserDao userMapper = (UserDao)wac.getBean("userDao");
		List<User> user = userMapper.findList(criteria);
		return user.get(0);
	}
	
}
