package com.learn.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.learn.dao.UserDao;
import com.learn.mapper.UserMapper;
import com.learn.pojo.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Resource(name = "userMapper")
	UserMapper userMapper;

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return userMapper.getUserByName(username);
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userMapper.add(user);
	}

}
