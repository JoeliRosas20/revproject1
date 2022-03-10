package com.training.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.ers.utility.DBConnection;
import com.project.model.User;

public class LoginDAOImpl implements LoginDAO{

	Connection connection = DBConnection.getConnection();

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
			statement.setString(4, user.getNotification());
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userValid;
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
				user.setQualification(res.getString(5));
				user.setNotification(res.getString(6));
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
				user.setNotification(res.getString(5));
				user.setQualification(res.getString(6));
				users.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
