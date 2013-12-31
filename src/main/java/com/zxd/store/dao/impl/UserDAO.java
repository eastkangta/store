package com.zxd.store.dao.impl;

import org.springframework.stereotype.Repository;

import com.zxd.store.dao.IUserDAO;
import com.zxd.store.entity.User;


@Repository
public class UserDAO  extends BaseDAO<User> implements IUserDAO{
	@Override
	public void add(User user) {
		
		super.add(user);
	}
}
