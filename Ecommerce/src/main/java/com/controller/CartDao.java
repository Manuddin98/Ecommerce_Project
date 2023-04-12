package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CartDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public boolean addCartItem(CartItem cartItem) {
		
		this.hibernateTemplate.save(cartItem);
		return true;
	}
	
	@Transactional
public boolean deleteCartItem(CartItem cartItem) {
		
		this.hibernateTemplate.delete(cartItem);
		
		return true;
	}
	
	@Transactional
public boolean updateCartItem(CartItem cartItem) {
	
		this.hibernateTemplate.update(cartItem);
	
	return true;
}

public CartItem getCartItem(int cartItemId) {
	
	CartItem cartItem=this.hibernateTemplate.get(CartItem.class, cartItemId);
	
	return cartItem;
}

public List<CartItem> listCartItems(String username) {
	
	List<CartItem> cartItemlist=this.hibernateTemplate.loadAll(CartItem.class);
	
	return cartItemlist;
}
	

}
