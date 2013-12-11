package com.zxd.store.dao.impl;

import com.zxd.store.dao.AbstractBaseDAO;
import com.zxd.store.dao.IUserDAO;


public class UserDAO  extends AbstractBaseDAO implements IUserDAO{
	public void add(){
		getEntityManager().createNamedQuery("select * from t_user");
	}
}
