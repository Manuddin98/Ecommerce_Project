package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public boolean saveOrder(OrderDetails orderDetails) {
		this.hibernateTemplate.save(orderDetails);
		return true;
	}
	
	@Transactional
public boolean updateOrder(String username) {
		
		this.hibernateTemplate.update(username);
		return true;
	}
	
	
	
	
}
