package com.training.pms.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.project.model.Reimbursement;
import com.project.model.User;

class LoginDAOImplTest {

	LoginDAO loginDAO = new LoginDAOImpl();
	User user;
	String username;
	String password;
	String gender;
	String status;
	String qualification;
	String reason;
	int def;
	int userId;
	int amount;
	int employeeId;
	int requestId;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		username = "bobby";
		password = "12345678";
		gender = "male";
		status = "employee";
		qualification = "Graduate";
		reason = "Transportation";
		def = -1;
		amount = 100;
		userId = 1;
		employeeId = 1;
		requestId = 1;
		user = new User(employeeId, username, password, gender, status, qualification);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	//-----USER STUFF-----

	@Disabled
	@Test
	@DisplayName("Testing register")
	void testRegister() {
		assertTrue(loginDAO.register(user));
	}

	@Disabled
	@Test
	@DisplayName("Testing login")
	void testValidate() {
		assertTrue(loginDAO.validate(username, password));
	}
	
	//-----MANAGER STUFF-----
	
	@Disabled
	@Test
	@DisplayName("Testing getting Pending Reimbursement")
	void testgetPendingReimbursmentE() {
		List<Reimbursement> pending = loginDAO.getPendingReimbursment();
		assertEquals(0, pending.size());
	}
	
	@Disabled
	@Test
	@DisplayName("Testing getting Resolved Reimbursement")
	void testgetResolvedReimbursmentE() {
		List<Reimbursement> resolved = loginDAO.getResolvedReimbursment();
		assertEquals(0, resolved.size());
	}
	
	@Disabled
	@Test
	@DisplayName("Testing accepting Request")
	void testacceptRequest() {
		assertTrue(loginDAO.acceptRequest(requestId));
	}
	
	@Disabled
	@Test
	@DisplayName("Testing denying Request")
	void testdenyRequest() {
		assertTrue(loginDAO.denyRequest(requestId));
	}

	@Disabled
	@Test
	@DisplayName("Testing getting users")
	void testGetUsers() {
		List<User> users = loginDAO.getUsers();
		assertNotEquals(0, users.size());
	}

	@Disabled
	@Test
	@DisplayName("Testing getting Reimbursement by Id")
	void testGetReimbursementByUserName() {
		List<Reimbursement> users = loginDAO.getReimbursementByUserName(employeeId);
		assertNotEquals(0, users.size());
	}
	
	//-----EMPLOYEE STUFF-----

	@Disabled
	@Test
	@DisplayName("Testing submitting request")
	void testsubmitARequest() {
		assertTrue(loginDAO.submitARequest(reason, amount, userId));
	}

	@Disabled
	@Test
	@DisplayName("Testing getting Pending Reimbursement")
	void testgetPendingReimbursment() {
		List<Reimbursement> pending = loginDAO.getPendingReimbursment(employeeId);
		assertNotEquals(0, pending.size());
	}
	
	@Disabled
	@Test
	@DisplayName("Testing getting Resolved Reimbursement")
	void testgetResolvedReimbursment() {
		List<Reimbursement> resolved = loginDAO.getResolvedReimbursment(employeeId);
		assertNotEquals(0, resolved.size());
	}
	
	@Disabled
	@Test
	@DisplayName("Testing updating info")
	void testupdateInfo() {
		assertTrue(loginDAO.updateInfo(username, qualification));
	}
	
	//@Disabled
	@Test
	@DisplayName("Testing getting info")
	void testgetInfo() {
		assertEquals(user, loginDAO.getInfo(username));
	}
	
	//-----HELPER STUFF-----

	@Disabled
	@Test
	@DisplayName("Testing getting users status")
	void testGetUserStatus() {
		String employee = "employee";
		String result = loginDAO.getUserStatus(username);
		assertEquals(employee, result);
	}
	
	@Disabled
	@Test
	@DisplayName("Testing getting Employee ID")
	void testGetEmployeeId() {
		int result = loginDAO.getEmployeeId(username);
		assertEquals(employeeId, result);
	}

}
