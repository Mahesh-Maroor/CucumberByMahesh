package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleTwoTest {
	@Given("^user is on Orange login page$")
	public void user_is_on_orange_login_page() {
	   System.out.println("Example 2 Login");
	}

	@When("^user enter username \"(.*)\" and password \"(.*)\"$")
	public void user_enter_username_password(String Username,String Password) {
	    System.out.println(Username+" "+Password);
	}
	@Then("^user gets into the logged in$")
	public void m1()
	{
		System.out.println("user gets into the logged in");
	}

}
