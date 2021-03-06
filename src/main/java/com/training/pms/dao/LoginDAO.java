package com.training.pms.dao;

import java.util.List;

import com.project.model.Reimbursement;
import com.project.model.User;

public interface LoginDAO {

	// USER STUFF
	public boolean register(User user);
	public boolean validate(String userId, String password);
	// MANAGER STUFF
	public List<Reimbursement> getPendingReimbursment();
	public List<Reimbursement> getResolvedReimbursment();
	public boolean acceptRequest(int requestId);
	public boolean denyRequest(int requestId);
	public List<User> getUsers();
	public List<Reimbursement> getReimbursementByUserName(int username);
	// EMPLOYEE STUFF
	public boolean submitARequest(String request, int amount, int employeeId);
	public List<Reimbursement> getPendingReimbursment(int employeeId);
	public List<Reimbursement> getResolvedReimbursment(int employeeId);
	public User getInfo(String employeeName);
	public boolean updateInfo(String employeeName, String qualification);
	// HELPER
	public String getUserStatus(String username);
	public int getEmployeeId(String username);

}
