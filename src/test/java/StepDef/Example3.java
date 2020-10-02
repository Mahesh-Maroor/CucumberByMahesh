package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example3 {
	
	@Given("^User about to sign in$")
	public void user_about_to_sign_in() {
	   System.out.println("User about to sign in");
	}

	@When("^User about to Enter UserName and password$")
	public void user_about_to_enter_user_name_and_password() {
		 System.out.println("User about to Enter UserName and password");
	}

	@Then("^user is unable to log in$")
	public void user_is_unable_to_log_in() {
		 System.out.println("^user is unable to log in$");
	}

	@Given("^User is not about to sign in$")
	public void user_is_not_about_to_sign_in() {
		 System.out.println("^User is not about to sign in$");
	}

	@When("^User is not about to Enter UserName and password$")
	public void user_is_not_about_to_enter_user_name_and_password() {
		 System.out.println("User is not about to Enter UserName and password"); 
	}

	@Then("^user is able to log in$")
	public void user_is_able_to_log_in() {
		 System.out.println("user is able to log in");
	}

}
