package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.wann;

public class MainSteps {
	@Given("User is on NetBanking Login Page")
	public void user_is_on_net_banking_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User landed on netbanking page");
	}

	@Given("User is on Practice landing Page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on Practice landing Page");
	}

	@When("User signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	}

//	@When("User login to application with {string} and password {string}")
//	public void user_login_to_application_with_and_password(String username, String password) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

	@When("^User login to application with (.+) and password (.+)$")
	public void user_login_to_application_with_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User logged into the application");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}

	@Given("Setup the entries in the database")
	public void setupEntries() {
		System.out.println("**********************");
		System.out.println("setup entries in the data base");
	}

	@When("launch the browser from config variables")
	public void launchEntries() {
		System.out.println("launch the browser from config variables");
	}

	@When("hit the home page url of banking site")
	public void hitUrl() {
		System.out.println("hit the home page url of banking site");
	}
}
