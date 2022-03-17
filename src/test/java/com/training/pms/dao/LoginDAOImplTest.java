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
	int userId;
	int amount;

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
		amount = 100;
		userId = 1;
		user = new User(-1, username, password, gender, status, qualification);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
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
	
	@Disabled
	@Test
	@DisplayName("Testing getting all the users")
	void testGetUsers() {
		List<User> users = loginDAO.getUsers();
		assertNotEquals(0,users.size());
	}
	
	@Disabled
	@Test
	@DisplayName("Testing getting users by name")
	void testGetUsersByUserName() {
		List<User> users = loginDAO.getUsersByUserName(username);
		assertNotEquals(0, users.size());
	}
	
	//@Disabled
	@Test
	@DisplayName("Testing submitting request")
	void testsubmitARequest() {
		assertTrue(loginDAO.submitARequest(reason, amount, userId));
	}
	
	//@Disabled
	@Test
	@DisplayName("Testing getting users status")
	void testGetUserStatus() {
		String employee = "employee";
		String result = loginDAO.getUserStatus(username);
		assertEquals(employee, result);
	}

}
