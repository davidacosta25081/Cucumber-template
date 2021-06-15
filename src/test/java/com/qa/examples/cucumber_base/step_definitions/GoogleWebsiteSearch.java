package com.qa.examples.cucumber_base.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleWebsiteSearch {
    WebDriver driver;
    String URL = "https://www.google.com";
    WebElement searchBar;
	
    
    @Given("Open Chrome and launch Google")
	public void openChromeAndLaunchGoogle() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	    driver = new ChromeDriver();
	    driver.manage().window().fullscreen();
	    driver.get(URL);
	    searchBar = driver.findElement(By.name("q"));
	}
	@When("typing website name on the search bar")
	public void typingWebsiteNameOnTheSearchBar() {
	  searchBar.sendKeys("www.nytimes.com");
	}
	
	@Then("display results")
	public void displayResults() {
	  searchBar.submit();
	}
















}
