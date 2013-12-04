package com.zxd.store.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class AbstractBaseDAO {
	@PersistenceContext(name ="storePU")
	public EntityManager getEntityManager(){
		return null;
	}

}
