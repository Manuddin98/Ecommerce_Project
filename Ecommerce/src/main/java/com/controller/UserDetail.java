package com.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetail {
	
	@Id
	String userName;
	String password;
	String role;
	boolean enabled;
	String cutomerNumber;
	String CustomerAddr;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getCutomerNumber() {
		return cutomerNumber;
	}
	public void setCutomerNumber(String cutomerNumber) {
		this.cutomerNumber = cutomerNumber;
	}
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	@Override
	public String toString() {
		return "UserDetail [userName=" + userName + ", password=" + password + ", role=" + role + ", enabled=" + enabled
				+ ", cutomerNumber=" + cutomerNumber + ", CustomerAddr=" + CustomerAddr + "]";
	}
	public UserDetail(String userName, String password, String role, boolean enabled, String cutomerNumber,
			String customerAddr) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
		this.cutomerNumber = cutomerNumber;
		CustomerAddr = customerAddr;
	}
	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
