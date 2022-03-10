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
	String finalNotification;
	String qualification;
	int userId;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		username = "dummy";
		password = "dummyroot123";
		gender = "male";
		finalNotification = "sms";
		qualification = "graduate";
		user = new User(-1, username, password, gender, finalNotification, qualification);
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
	
	//@Disabled
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

}
