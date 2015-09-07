package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class GetAddressAction extends ActionSupport {
	JDBCService js = new JDBCService();
	ActionContext act = ActionContext.getContext();

	@Override
	public String execute() throws Exception {
		List listname1=js.addressname();
		act.getSession().put("listname1", listname1);
		return SUCCESS;
	}

	
}
