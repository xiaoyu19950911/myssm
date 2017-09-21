package com.learn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.learn.dao.UserDao;
import com.learn.pojo.User;
import com.learn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	UserDao userDao;

	@Override
	public User checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		User user = userDao.findUserByName(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;

	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

}
