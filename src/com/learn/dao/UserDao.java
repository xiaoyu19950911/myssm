package com.learn.dao;

import com.learn.pojo.User;

public interface UserDao {

	public User findUserByName(String username);

	public void add(User user);

}
