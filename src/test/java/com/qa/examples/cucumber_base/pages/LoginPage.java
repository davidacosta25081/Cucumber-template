package com.qa.examples.cucumber_base.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id = "name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login")
	WebElement login;


    @FindBy(id = "logout")
    WebElement btn_logout;
	
	
    public LoginPage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
    }
    
    
    
    
    public void enterUsername(String typedUsername) {
		username.sendKeys(typedUsername);
	}

	public void enterPassword(String typedPassword) {
		password.sendKeys(typedPassword);
	}

	public void clickLogin() {
		login.click();
	}


    public void checkLogoutIsDisplayed() {
    btn_logout.isDisplayed();	
    	
    	
    }
    

}
