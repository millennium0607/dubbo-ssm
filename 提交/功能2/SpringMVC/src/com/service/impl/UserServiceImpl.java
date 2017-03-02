package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> getUsers() {

		return userDao.getUser();
	}

	public User getUserInfo(User user) throws Exception {
		return userDao.getUser(user);
	}

	public void saveUser(User user) throws Exception {
		userDao.insertUser(user);
	}

	public int deleteUser(Long id) throws Exception {
		return userDao.deleteUser(id);
	}

}
