package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Netbanking landing page");
	}
	
	//Sec5 Data driven testing
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Practice landing page");
		Assert.assertTrue(false);
	}
	
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	

	  //This use without user and password
	
	    /*
	     * @When("User login to application") public void user_login_to_application() {
	     * // Write code here that turns the phrase above into concrete actions
	     * System.out.println("User login to application"); }
	     */
	
	  //This is using with multiple scenarios with multiple username and password
		/*
		 * @When("User login to application with {string} and password {string}") public
		 * void user_login_to_application_with_and_password(String username, String
		 * password) { // Write code here that turns the phrase above into concrete
		 * actions System.out.println("User name is " +username+
		 * " and Password is "+password); }
		 */
	  
	  //This is using with multiple scenarios with multiple username and password and multiple data types
	  //For different data types like integer or float or string or ect... we use blow
	  //When use (^(.+)    (.+)$) data type can be any data type | Step definition is define as generic
	  @When("^User login to application with (.+) and password (.+)$") 
	  public void user_login_to_application_with_and_password(String username, String password) { 
		 // Write code here that turns the phrase above into concrete actions 
		  System.out.println("User name is " +username+ " and Password is "+password); 
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
	
	@Given("Setup the entries in database")
	public void setup_entries() {
		System.out.println("*****************************");
		System.out.println("Setup the entries in database");
	}
	
	@When("Learnch the browser from config variables")
	public void learnchBrowser() {
		System.out.println("Learnch the browser from config variables");
	}
	
	@When("Hit the home page url of banking site")
	public void hitHomepageurl() {
		System.out.println("Hit the home page url of banking site");
	}

}
