package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CategoryDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//for adding 
	@Transactional
	public void addCategory(Category category) {
		
		this.hibernateTemplate.save(category);
		
		
	}
	
	
	
	//for deleting 
	@Transactional
public boolean deleteCategory(Category category) {
		 
	this.hibernateTemplate.delete(category);
	
	return true;
		
	}
	
	@Transactional
public boolean updateCategory(Category category) {
	
		this.hibernateTemplate.save(category);
	
	return true;
}

public List<Category> listCategory(){
	
	List<Category> category=this.hibernateTemplate.loadAll(Category.class);
	
	return category;
	
}

public Category getCategory(int categoryId) {
	
	return this.hibernateTemplate.get(Category.class, categoryId);
	
}
	
	

}
