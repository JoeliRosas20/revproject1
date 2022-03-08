package com.training.pms.dao;

import com.project.model.User;

public interface LoginDAO {
	
	public boolean register(User user);
	public boolean validate(String userId, String password);
	
}
