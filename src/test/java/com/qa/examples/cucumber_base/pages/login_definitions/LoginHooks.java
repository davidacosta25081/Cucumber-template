package com.qa.examples.cucumber_base.pages.login_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.examples.cucumber_base.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHooks {
   WebDriver webDriver;
   LoginPage login;
   
   @Before 
    public void browserSetup() {
	   
	   System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	   webDriver = new ChromeDriver();
	    
	   
	   
   }
	
   @After
	public void teardown() throws InterruptedException {
		if (webDriver != null) {
			Thread.sleep(3000);
			webDriver.quit();
		}
	}
	
	
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
		webDriver.manage().window().fullscreen();
		webDriver.get("https://example.testproject.io/web/"); 
	  
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	login.enterUsername(username);   
	login.enterPassword(password);   
	}

	@When("user clicks login")
	public void user_clicks_login() {
	login.clickLogin();   
	
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	login.checkLogoutIsDisplayed();   
	
	
	
	}



















}
