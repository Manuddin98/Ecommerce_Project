package com.controller;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetails {

	@Id
	@GeneratedValue
	int orderID;
	int cartID;
	int TotalAmount;
	
	String username;
	Date orderDate;
	String ShippingAddr;
	String Trans;
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public int getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddr() {
		return ShippingAddr;
	}
	public void setShippingAddr(String shippingAddr) {
		ShippingAddr = shippingAddr;
	}
	public String getTrans() {
		return Trans;
	}
	public void setTrans(String trans) {
		Trans = trans;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderID=" + orderID + ", cartID=" + cartID + ", TotalAmount=" + TotalAmount
				+ ", username=" + username + ", orderDate=" + orderDate + ", ShippingAddr=" + ShippingAddr + ", Trans="
				+ Trans + "]";
	}
	public OrderDetails(int orderID, int cartID, int totalAmount, String username, Date orderDate, String shippingAddr,
			String trans) {
		super();
		this.orderID = orderID;
		this.cartID = cartID;
		TotalAmount = totalAmount;
		this.username = username;
		this.orderDate = orderDate;
		ShippingAddr = shippingAddr;
		Trans = trans;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
