package com.learn.mapper;

import com.learn.pojo.User;

public interface UserMapper {

	public User getUserByName(String username);

	public void add(User user);

}
