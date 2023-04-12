package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SupplierDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//for adding 
		@Transactional
		public boolean addSupplier(Supplier supplier) {
			
			this.hibernateTemplate.save(supplier);
			
			return true;
		}
	
	
		//for updating
		@Transactional
		public boolean updateSupplier(Supplier supplier) {
			
			this.hibernateTemplate.saveOrUpdate(supplier);
			
			return true;
		}
		
		//for deleting 
		@Transactional
		public boolean deleteSupplier(Supplier supplier) {
			
			this.hibernateTemplate.delete(supplier);
			
			return true;
		}
		
		
		public List<Supplier> listProduct(){
			List<Supplier> product=this.hibernateTemplate.loadAll(Supplier.class);
			return product;
		}
		
		
		public  Supplier getProduct(int productId) {
			Supplier product=this.hibernateTemplate.get(Supplier.class, productId);
			return product;
			
		}
		
		

}
