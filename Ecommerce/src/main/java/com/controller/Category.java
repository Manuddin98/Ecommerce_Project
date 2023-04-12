package com.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	int categoryID;
	String categoryName;
	String categoryDesc;
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", categoryDesc="
				+ categoryDesc + "]";
	}
	public Category(int categoryID, String categoryName, String categoryDesc) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
