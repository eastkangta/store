package com.zxd.store.dao.impl;

import com.zxd.store.dao.AbstractBaseDAO;


public class UserDAO extends AbstractBaseDAO{
	public void add(){
		getEntityManager().createNamedQuery("select * from t_user");
	}
}
