package com.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CartItem {

	@Id
	@GeneratedValue
	int cartItemId;
	int productId;
	int quantity;
	int price;
	
	String productName;
	String username;
	String paymentStatus;
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", productId=" + productId + ", quantity=" + quantity + ", price="
				+ price + ", productName=" + productName + ", username=" + username + ", paymentStatus=" + paymentStatus
				+ "]";
	}
	public CartItem(int cartItemId, int productId, int quantity, int price, String productName, String username,
			String paymentStatus) {
		super();
		this.cartItemId = cartItemId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
		this.productName = productName;
		this.username = username;
		this.paymentStatus = paymentStatus;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
