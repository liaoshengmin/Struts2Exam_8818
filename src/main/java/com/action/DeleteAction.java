package com.action;
import com.service.JDBCService;

public class DeleteAction{

	JDBCService js = new JDBCService();
	private int id;


	public String delete(){
		System.out.println(id);
		js.delete(id);
		return "success";

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	



}
