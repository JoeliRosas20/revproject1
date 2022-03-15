package com.training.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.ers.utility.DBConnection;
import com.project.model.User;

public class LoginDAOImpl implements LoginDAO{

	Connection connection = DBConnection.getConnection();
	private static Logger logger = Logger.getLogger(LoginDAOImpl.class);

	@Override
	public boolean register(User user) {
		System.out.println("Registration");
		PreparedStatement statement = null;
		int rows = 0;
		try {
			statement = connection.prepareStatement("insert into users values(default,?,?,?,?,?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getGender());
			statement.setString(4, user.getStatus());
			statement.setString(5, user.getQualification());

			rows = statement.executeUpdate();
			System.out.println(rows + " inserted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean validate(String username, String password) {
		boolean userValid = false;
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("select * from users where username = ? and password = ?");
			stat.setString(1, username);
			stat.setString(2, password);
			ResultSet res = stat.executeQuery();
			userValid = res.next();
			logger.info(username+" has logged on at: "+new java.util.Date());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userValid;
	}
	
	public List<User> getPendingReimbursment(){
		List<User> pending = new ArrayList<User>();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet res = statement.executeQuery("select * from reimbursements where status = pending");
			while(res.next()) {
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pending;
	}
	
	public List<User> getResolvedReimbursment(){
		List<User> resolved = new ArrayList<User>();
		return resolved;
	}
	
	public boolean acceptRequest(int requestId){
		return false;
	}
	
	public boolean denyRequest(int requestId) {
		return false;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("select * from users");
			while(res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setGender(res.getString(4));
				user.setStatus(res.getString(5));
				user.setQualification(res.getString(6));
				users.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<User> getUsersByUserName(String username) {
		System.out.println("##Printing search users  ");
		List<User> users = new ArrayList<User>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("select * from users where username = '"+username+"'");
			while (res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setGender(res.getString(4));
				user.setStatus(res.getString(5));
				user.setQualification(res.getString(6));
				users.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public String getUserStatus(String username) {
		System.out.println("Inside user status");
		String status = " ";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement("select status from users where username = ?");
			statement.setString(1, username);
			ResultSet res = statement.executeQuery();
			res.next();
			status = res.getString(1);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

}
