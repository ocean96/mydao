package com.bluemoon.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.bluemoon.demo.dao.util.Criteria;

public interface SuperDao<T> {
	
	Object selectList(@Param("criteria")Criteria<T> criteria);
	
	Object select(@Param("criteria")Criteria<T> criteria);
	
	Object selectPage(@Param("criteria")Criteria<T> criteria);
	
	Integer count(@Param("criteria")Criteria<T> criteria);
	
	Integer insert(@Param("criteria")Criteria<T> criteria);
	
	Integer update(@Param("criteria")Criteria<T> criteria);
	
	Integer delete(@Param("criteria")Criteria<T> criteria);
}
