package Reto1.steps;

import static org.hamcrest.Matchers.equalTo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class RequestApiUsers {
	
	@Step
	public void setHeaders(String headerKey, String headerValue) {
		SerenityRest.given()
		.header(headerKey,headerValue);
	}

	@Step
	public void requestGetAPI(String apiEndpoint) {
		SerenityRest.when()
		.get(apiEndpoint).prettyPeek();
	}
	
	@Step
	public void verifyUserId(String userId) {
		SerenityRest.then()
		.body("result[0].id", equalTo(userId));
		}

}
