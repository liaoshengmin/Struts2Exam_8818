package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class GetAddressAction{
	JDBCService js = new JDBCService();
	public List list;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}

	public String getAddress(){
		list=js.addressname();
		return "success";
	}

	
}
