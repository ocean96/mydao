package com.bluemoon.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.model.User;

public interface UserDao {
	
	List<User> findList(@Param("criteria")Criteria<User> criteria);
	
}