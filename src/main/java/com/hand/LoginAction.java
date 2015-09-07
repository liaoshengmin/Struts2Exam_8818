package com.hand;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -213187751666478769L;
	private String username;
	private String password;
	private String email;
	
	
	
	public String execute(){
		if(username.equals("admin") && password.equals("123")){
			return "success";
		}else{
			return "fail";
		}
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
//	public void validate(){
//		System.out.println("1111111");
//		if(username==null||username.trim().equals("")){
//			addFieldError("username", "不能为空");
//		}
//		if(password==null||password.trim().equals("")){
//			addFieldError("password", "不能为空");
//		}
//	}
	
	
	
}
