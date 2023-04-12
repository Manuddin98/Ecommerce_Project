package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//for adding
	@Transactional
	public boolean addProduct(Product product) {
		this.hibernateTemplate.save(product);
		return true;
	}
	
	//for deleting 
	@Transactional
	public boolean deleteProduct(Product product) {
		
		this.hibernateTemplate.delete(product);
		
		return true;
	}
	
	//for updating
	@Transactional
	public boolean updateProduct(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
		
		return true;
	}
	
	public List<Product> listProduct(){
		List<Product> product=this.hibernateTemplate.loadAll(Product.class);
		return product;
	}
	
	public  Product getProduct(int productId) {
		Product product=this.hibernateTemplate.get(Product.class, productId);
		return product;
		
	}

}
