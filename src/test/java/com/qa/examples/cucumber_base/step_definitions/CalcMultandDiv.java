package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcMultandDiv {
    Calculator calculator;
	double actualResult;
	
	
	@Given("a new calculator")
	public void aCalculator() {
		this.calculator = new Calculator();
	}

	
	
	
	@When("{int} by {int} are multiply")
	public void byAreMultiply(Integer int1, Integer int2) {
	    this.actualResult = calculator.multiply(int1, int2);
	    throw new io.cucumber.java.PendingException();
	}



	@When("{int} is divided by {int}")
	public void isDividedBy(Integer int1, Integer int2) {
		this.actualResult = calculator.divide(int1, int2);
	    throw new io.cucumber.java.PendingException();
	}




	@Then("the result should be = {int}")
	public void theResultShouldBeMD(Integer expectedResult) {
	    assertEquals(expectedResult.doubleValue(), actualResult, 2);
	}
    



}
