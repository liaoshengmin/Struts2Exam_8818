package com.action;

import java.util.List;

import com.film.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class ShowAction extends ActionSupport {
	JDBCService js = new JDBCService();
	ActionContext act = ActionContext.getContext();
	
	@Override
	public String execute() throws Exception {
		List<Customer> list =js.customer();
		act.getSession().put("list", list);
		return SUCCESS;
	}

}
