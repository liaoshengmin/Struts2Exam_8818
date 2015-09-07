package com.service;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.film.Customer;



public class JDBCService {

	Connection conn = new ConnectionMySql().makeConnectionMySql();

	public boolean login(String fname,String password){
		ResultSet rs = null;
		String sql="select * from customer where first_name=? and last_name=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while(rs.next()){
				rs.close();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public List<Customer> customer(){
		ResultSet rs = null;
		List<Customer> list = new  ArrayList<Customer>();
		String sql="select first_name,last_name,address,email,customer_id,"
				+ "customer.last_update from customer,address where customer.address_id = address.address_id order by customer_id ";

		try {
			PreparedStatement ps = conn.prepareCall(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Customer cus = new Customer();
				cus.setFirst_name(rs.getString("first_name"));
				cus.setLast_name(rs.getString("last_name"));
				cus.setAddress(rs.getString("address"));
				cus.setEmail(rs.getString("email"));
				cus.setCustomer_id(rs.getInt("customer_id"));
				cus.setLast_update(rs.getString("last_update"));
				list.add(cus);

			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}


	//	public JSONArray customer1() {
	//		// TODO Auto-generated method stub
	//		String sql = "SELECT first_name,last_name,address,email,customer_id,customer.last_update FROM customer,address WHERE customer.address_id=address.address_id LIMIT 0,100";
	//		JSONArray json = new JSONArray();
	//		PreparedStatement preparedStatement;
	//		try {
	//			preparedStatement = conn.prepareCall(sql);
	//			ResultSet resultSet = preparedStatement.executeQuery();
	//			while(resultSet.next()){
	//				JSONObject jsonObject = new JSONObject();
	//				jsonObject.put("first_name", resultSet.getString("first_name"));
	//				jsonObject.put("last_name", resultSet.getString("last_name"));
	//				jsonObject.put("address", resultSet.getString("address"));
	//				jsonObject.put("email", resultSet.getString("email"));
	//				jsonObject.put("customer_id", resultSet.getString("customer_id"));
	//				jsonObject.put("last_update", resultSet.getString("last_update"));
	//				json.add(jsonObject);
	//			}
	//			preparedStatement.close();
	//			return json;
	//		} catch (SQLException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		return null;
	//	}



	public void add(Customer cu,int id){

		String sql="INSERT INTO customer(first_name,last_name,email,address_id,store_id,create_date) VALUES(?,?,?,?,?,?);";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,cu.getFirst_name());
			ps.setString(2,cu.getLast_name());
			ps.setString(3, cu.getEmail());;
			ps.setInt(4, id);
			ps.setInt(5, 1);
			ps.setString(6,"2015-8-24 19:23:15");
			ps.execute();


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public void delete(int id){
		System.out.println(id);
		String sql =null;
		PreparedStatement ps;
		try {

			sql = "delete from payment where customer_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			sql = "delete from rental where customer_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			sql = "delete from customer where customer_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);		
			ps.execute();



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("INFO-->删除出错！");
		}


	}


	public Customer showOne(int id){
		ResultSet rs = null;
		String sql="select first_name,last_name,email,address from customer,address where customer.address_id=address.address_id and film_id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			while(rs.next()){
				Customer cu = new Customer();
				cu.setFirst_name(rs.getString("first_name"));
				cu.setLast_name(rs.getString("last_name"));
				cu.setEmail(rs.getString("email"));
				cu.setAddress(rs.getString("address"));
				rs.close();
				return cu;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public List addressname(){
		ResultSet rs = null;
		String sql="select address from address";
		List list = new  ArrayList();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				list.add(rs.getString("address"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	public int addressid(String name){
		ResultSet rs = null;
		String sql="select address_id from address where address=?";

		try {
			System.out.println(name);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,name);
			rs = ps.executeQuery();
			rs.next();
			int a =rs.getInt("address_id");
			rs.close();
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;


	}




}



class ConnectionMySql {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	Properties prop = new Properties();
	public Connection makeConnectionMySql(){

		Connection conn = null;

		try {
			InputStream in = JDBCService.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			try {
				prop.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
			driver = prop.getProperty("driver");
			dburl = prop.getProperty("dburl");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl,user,password);


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}