package com.action;

import com.film.Customer;
import com.service.JDBCService;

public class UpdateAction {
	private int customerId;
	private String fname;
	private String lname;
	private String email;
	private String addressname;
	JDBCService js = new JDBCService();
	
	public String update(){
		Customer cus = new Customer();
		cus.setCustomer_id(customerId);
		cus.setFirst_name(fname);
		cus.setLast_name(lname);
		cus.setEmail(email);
		
		int id=js.addressid(addressname);
		js.update(cus, id);
		return "success";
	}
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressname() {
		return addressname;
	}
	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}
	
	
	
	
	
	
	

}
