package com.training.pms.dao;

import java.util.List;

import com.project.model.User;

public interface LoginDAO {
	
	public boolean register(User user);
	public boolean validate(String userId, String password);
	public List<User> getUsers();
	public List<User> getUsersByUserName(String username);
	
}
