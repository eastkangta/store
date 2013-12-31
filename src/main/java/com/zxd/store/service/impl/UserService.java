package com.zxd.store.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxd.store.dao.IUserDAO;
import com.zxd.store.entity.User;
import com.zxd.store.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Resource
	private IUserDAO userDAO;

	@Override
	public void addUser(User user) {
		userDAO.add(user);
	}
	
	
	public IUserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
