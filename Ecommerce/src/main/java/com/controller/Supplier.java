package com.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	int supplierID;
	String supplierName;
	String supplierAddr;
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddr() {
		return supplierAddr;
	}
	public void setSupplierAddr(String supplierAddr) {
		this.supplierAddr = supplierAddr;
	}
	@Override
	public String toString() {
		return "Supplier [supplierID=" + supplierID + ", supplierName=" + supplierName + ", supplierAddr="
				+ supplierAddr + "]";
	}
	public Supplier(int supplierID, String supplierName, String supplierAddr) {
		super();
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierAddr = supplierAddr;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
