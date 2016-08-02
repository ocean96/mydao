package com.bluemoon.demo.service;

import com.bluemoon.demo.model.User;
import com.bluemoon.demo.util.Criteria;

public interface UserService {
	public User getUser(Criteria<User> criteria);
}
