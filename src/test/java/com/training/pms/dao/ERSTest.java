package com.training.pms.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class ERSTest {
	
	static String browserName = "chrome";
	static WebDriver driver;
	String username;
	String password;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		username = "Chris";
		password = "12345678";
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	//@Disabled
	@Test
	void testLogin() {
		driver.get("http://localhost:8080/alstram-ers-revature/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id=\"viewAll\"]/a")).click();
		//assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}
	
	@Disabled
	@Test
	void testSignup() {
		driver.get("http://localhost:8080/alstram-ers-revature/SignUp.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]")).sendKeys(password);
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("manager")).click();
		Select qual = new Select(driver.findElement(By.id("qualification")));
		qual.selectByVisibleText("Graduate");
		driver.findElement(By.id("submit")).click();
		//assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}

}
