package com.bluemoon.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bluemoon.demo.SuperDao;
import com.bluemoon.demo.model.User;
import com.bluemoon.demo.util.Criteria;

public interface UserDao<T> extends SuperDao<T> {
	
	@Override
	List<User> selectList(@Param("criteria")Criteria<T> criteria);
	
	@Override
	User select(@Param("criteria")Criteria<T> criteria);
	
	@Override
	Integer count(@Param("criteria")Criteria<T> criteria);
	
	@Override
	Integer insert(@Param("criteria")Criteria<T> criteria);
	
	@Override
	Integer update(@Param("criteria")Criteria<T> criteria);
	
	@Override
	Integer delete(@Param("criteria")Criteria<T> criteria);
	
}