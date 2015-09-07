package com.action;

import javax.servlet.RequestDispatcher;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class DeleteAction extends ActionSupport {

	JDBCService js = new JDBCService();
	private int typeid;

	@Override
	public String execute() throws Exception {
		js.delete(typeid);
		return SUCCESS;

	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}




}
