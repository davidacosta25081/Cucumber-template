package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanCalculateNumbersCorrectly {
	
	private Calculator calculator;
	private double actualResult;

	@Given("a calculator")
	public void aCalculator() {
		this.calculator = new Calculator();
	}

	@When("{double} and {double} are added")
	public void andAreAdded(Double leftOperand, Double rightOperand) {
	    this.actualResult = this.calculator.add(leftOperand, rightOperand);
	}
	
	
	@When("{double} and {double} are substracted")
	public void and_are_substracted(Double double1, Double double2) {
	  this.actualResult = calculator.subtract(double1, double2);    
	}

	
	
	@When("{double} is divided by {double}")
	public void is_divided_by(Double double1, Double double2) {
	  this.actualResult = calculator.divide(double1, double2);
	    
	}

	@When("{double} multiplies {double}")
	public void multiplies(Double double1, Double double2) {
		this.actualResult = calculator.multiply(double1, double2);
	}

	
	
	@Then("the result should be {double}")
	public void theResultShouldBe(Double expectedResult) {
	    assertEquals(expectedResult, actualResult, 7);
	}


}
