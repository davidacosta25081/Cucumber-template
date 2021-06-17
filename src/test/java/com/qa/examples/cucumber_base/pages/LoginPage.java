package com.qa.examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login")
	WebElement login;


    @FindBy(id = "logout")
    WebElement btn_logout;
	
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
