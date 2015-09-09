package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;

import com.film.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JDBCService;

public class LoginAction{
	private String fname;
	private String password;
	

	public String login(){
		JDBCService js = new JDBCService();
		boolean bool = js.login(fname,password);
		Map session = (Map) ActionContext.getContext().getSession();
		if(bool){
			session.put("flag", "login_success");
			session.put("user", fname);
			return "success";

		}
		else{
			session.put("flag", "login_error");
			return "error";
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
