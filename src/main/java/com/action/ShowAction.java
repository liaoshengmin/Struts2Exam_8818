package com.action;

import java.util.List;

import com.film.Customer;
import com.service.JDBCService;

public class ShowAction{
	JDBCService js = new JDBCService();
	public List<Customer> list;
	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}

	public String show(){
		list =js.customer();
		return "success";
	}

}
