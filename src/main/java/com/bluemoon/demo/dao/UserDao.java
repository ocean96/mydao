package com.bluemoon.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.model.User;

public interface UserDao<T> extends SuperDao<T> {
	
	@Override
	List<User> selectList(@Param("criteria")Criteria<T> criteria);
	
	@Override
	User select(@Param("criteria")Criteria<T> criteria);
	
	@Override
	Integer count(@Param("criteria")Criteria<T> criteria);
	
//	@Override
//	List<>
	
}