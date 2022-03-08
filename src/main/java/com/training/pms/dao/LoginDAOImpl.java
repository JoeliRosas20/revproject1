package com.training.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.ers.utility.DBConnection;
import com.project.model.User;

public class LoginDAOImpl implements LoginDAO{

	Connection connection = DBConnection.getConnection();

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean validate(String username, String password) {
		// TODO Auto-generated method stub
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

}
