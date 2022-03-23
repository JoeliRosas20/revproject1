package com.training.pms.dao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.project.pages.LoginPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeLogin {
	
	static String browserName = "chrome";
	static WebDriver driver;
	LoginPageFactory loginPage;

	
	@Given("A new tab is open")
	public void a_new_tab_is_open() {
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
	    loginPage = new LoginPageFactory(driver);
	}

	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("http://localhost:8080/alstram-ers-revature/Login.html");
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    loginPage.enterUsername(username);
	    loginPage.enterPassword(password);
	}

	
	@When("User clicks on login button of test project")
	public void user_clicks_on_login_button_of_test_project() {
	    loginPage.clickLogin();
	}

	
	@Then("User is navigated to the page")
	public void user_is_navigated_to_the_page() {
	    System.out.println("We're in");
	}

}
