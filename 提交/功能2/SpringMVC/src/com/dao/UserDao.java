package com.dao;

import java.util.List;

import com.bean.User;

public interface UserDao {

	public List<User> getUser();

	public User getUser(User user);

	public void insertUser(User user);

	public int deleteUser(Long id);
}
