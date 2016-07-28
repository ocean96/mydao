//package com.bluemoon.demo.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bluemoon.demo.dao.UserDao;
//
//@Service(value="userService")
//public class UserServiceImpl implements UserService {
//	
//	@Autowired
//	private UserDao userDao;
//
//	/**
//	 * @Title:getUser
//	 * @Desciption:TODO 获取用户信息
//	 * @param @param criteria
//	 * @param @return
//	 * @return User
//	 * @param criteria
//	 * @return
//	 */
//	public User getUser(Criteria<User> criteria) {
//		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
//		UserDao userMapper = (UserDao)wac.getBean("userDao");
//		List<User> user = userMapper.findList(criteria);
//		return user.get(0);
//	}
//	
//}
