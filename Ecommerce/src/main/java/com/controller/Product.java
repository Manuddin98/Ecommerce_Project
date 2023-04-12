package com.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	int productId;
	
	String productName;
	String productDesc;
	int price;
	int stoct;
	int categoryId;
	int supplierId;
	@Transient
	MultipartFile pimage;
	
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStoct() {
		return stoct;
	}
	public void setStoct(int stoct) {
		this.stoct = stoct;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", price=" + price + ", stoct=" + stoct + ", categoryId=" + categoryId + ", supplierId=" + supplierId
				+ "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productDesc, int price, int stoct, int categoryId,
			int supplierId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.stoct = stoct;
		this.categoryId = categoryId;
		this.supplierId = supplierId;
	}
	
	
	
	
	

}
