package com.training.pms.dao;

import java.util.List;

import com.project.model.User;

public interface LoginDAO {
	
	//USER STUFF
	public boolean register(User user);
	public boolean validate(String userId, String password);
	public List<User> getUsers();
	public List<User> getUsersByUserName(String username);
	//EMPLOYEE STUFF
	//Employee see their pending reimbursement
	//Employee see their resolved reimbursement
	//Employee can see their info
	//Employee can update their info
	//MANAGER STUFF
	//Manager see all pending reimbursement
	//Manager see all resolved reimbursement
	//Manager see request of specific employee
	//Manager can accept request
	//Manager can deny request
	//HELPER
	//Get username to see whether its an employee or manager
	public String getUserStatus(String username);
}
