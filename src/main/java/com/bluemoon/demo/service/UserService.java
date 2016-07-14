package com.bluemoon.demo.service;

import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.model.User;

public interface UserService {
	public User getUser(Criteria<User> criteria);
}
