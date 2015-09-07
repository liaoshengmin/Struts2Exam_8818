package com.action;

import java.util.List;

import javax.servlet.RequestDispatcher;

import com.film.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class LoginAction extends ActionSupport {
	private String fname;
	private String password;
	
	@Override
	public String execute() throws Exception {
		JDBCService js = new JDBCService();
		boolean bool = js.login(fname,password);
		ActionContext act = ActionContext.getContext();
		if(bool){
			act.getSession().put("flag", "login_success");
			return SUCCESS;

		}
		else{
			act.getSession().put("flag", "login_error");
			return ERROR;
		}
		
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
