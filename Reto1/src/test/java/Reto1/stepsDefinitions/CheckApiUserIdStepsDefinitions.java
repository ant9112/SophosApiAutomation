package Reto1.stepsDefinitions;

import static org.hamcrest.Matchers.equalTo;

import Reto1.steps.RequestApiUsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;


public class CheckApiUserIdStepsDefinitions {

	
	@Steps
	RequestApiUsers requestApiUsers;
	
	@Given("^I have the headers (.*) with value (.*)$")
	public void i_have_the_headers_for_the_request(String headerKey , String headerValue) {
		requestApiUsers.setHeaders(headerKey, headerValue);
	}


	@When("^I make a request get to the api (.*)$")
	public void i_make_a_request_get_to_the_api(String apiEndpoint) {
		requestApiUsers.requestGetAPI(apiEndpoint);
	}

	@Then("^I should see the user id (.*)$")
	public void i_should_see_the_user_id(String userId) {
		requestApiUsers.verifyUserId(userId);
	}

	
	

}
