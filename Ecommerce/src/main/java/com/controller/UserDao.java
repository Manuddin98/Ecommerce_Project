package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public boolean registerUser(UserDetail user) {
		
		this.hibernateTemplate.save(user);
		
		return true;
		
	}
	
	@Transactional
	public boolean updateUser(UserDetail user) {
		
		this.hibernateTemplate.saveOrUpdate(user);
		
		return true;
	}
	
	public UserDetail getUser(String userName) {
		UserDetail userDetails=this.hibernateTemplate.get(UserDetail.class, userName);
		
		return userDetails;
	}

}
