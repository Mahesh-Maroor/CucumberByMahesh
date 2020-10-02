package StepDef;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex4 {

	
	@Given("User about to")
	public void user_about_to(Scenario s) {
	    System.out.println("Scenario name is:"+s.getName());
	}

	@When("User about to Enter UserName")
	public void user_about_to_enter_user_name() {
	   
	}

	@Then("user is unable to")
	public void user_is_unable_to() {
	   
	}

	@Given("Uabout to sign in")
	public void uabout_to_sign_in() {
	  
	}

	@When("about to Enter UserName and password")
	public void about_to_enter_user_name_and_password() {
	
	}

	@Then("able to log in")
	public void able_to_log_in() {
	    
	}
}
