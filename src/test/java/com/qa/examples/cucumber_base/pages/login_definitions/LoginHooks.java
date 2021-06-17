package com.qa.examples.cucumber_base.pages.login_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.examples.cucumber_base.hooks.Hooks;
import com.qa.examples.cucumber_base.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHooks {
   WebDriver driver;
   LoginPage login;
   
   
   
    public LoginHooks(Hooks hooks) {
	  this.driver = hooks.getWebDriver() ;
	}
	
   
   @After
	public void teardown() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(6000);
			driver.quit();
		}
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.manage().window().fullscreen();
		driver.get("https://example.testproject.io/web/"); 
	  
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	login = new LoginPage(driver);
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
