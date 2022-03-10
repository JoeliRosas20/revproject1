package com.training.pms.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ERSTest {
	
	static String browserName = "chrome";
	static WebDriver driver;

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
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		driver.get("http://localhost:8080/alstram-ers-revature/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("bobby");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.id("btnsubmit")).click();
		//assertTrue(driver.findElement(By.id("inventory_container")).isDisplayed());
	}

}
