package com.learn.service;

import com.learn.pojo.User;

public interface UserService {
	public User checkLogin(String username, String password);

	public void add(User user);

}
