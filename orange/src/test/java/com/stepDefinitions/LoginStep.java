package com.stepDefinitions;

import org.junit.Assert;

import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.utils.BaseClass;
import com.utils.CommonMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	LoginPage login;
	DashBoardPage dashBoard;
	

	@Given("OrangHRM logo is displayed")
	public void oranghrm_logo_is_displayed() {
		login=new LoginPage();
	    BaseClass.browsers(); 
	   // Assert.assertTrue(login.logo.isDisplayed());
	   
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String value1, String value2) {
		login=new LoginPage();
	    CommonMethod.enterValue(login.username, value1);
	    CommonMethod.enterValue(login.password, value2);
	}

	@When("I click login button")
	public void i_click_login_button() {
		CommonMethod.clickValue(login.click);
	}

	@Then("Login is successful")
	public void login_is_successful() {
		dashBoard.welcome.getText();
		
		
	}

	@Given("I have enter {string} and {string}")
	public void i_have_enter_and(String v1, String v2) {
		login=new LoginPage();
	    CommonMethod.enterValue(login.username, v1);
	    CommonMethod.enterValue(login.password, v2);
	}

	@Given("I will click login button")
	public void i_will_click_login_button() {
		CommonMethod.clickValue(login.click);
	}

	@Then("I see error message {string}")
	public void i_see_error_message(String errMessage) {
		login=new LoginPage();
		String actualError = login.errorMessage.getText();
		Assert.assertEquals(errMessage, actualError);
	}
}
