package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleOneTest {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("On login page");
	}

	@When("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_and(String string, String string2) {
	   System.out.println(string+" "+string2);
	}

	@Then("user gets logged in")
	public void user_gets_logged_in() {
		System.out.println("Logged in successfully");
	}
}
