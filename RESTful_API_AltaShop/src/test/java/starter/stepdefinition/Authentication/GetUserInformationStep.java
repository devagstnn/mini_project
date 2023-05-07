package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.GetUserInformationPage;

public class GetUserInformationStep {

    @Steps
    GetUserInformationPage getInform;
    @Given("user has api auth")
    public void userHasApiAuth() {
        getInform.userHasApiAuth();
    }
    @And("user send request body auth")
    public void userSendRequestBodyAuth() {
        getInform.userSendRequestBodyAuth();
    }
    @When("user has api endpoint get user information")
    public void userHasApiEndpointGetUserInformation() {
        getInform.apiEndpointGetUserInformation();
    }
    @And("user send HTTP request get user information")
    public void userSendHTTPRequestGetUserInformation() {
        getInform.sendHTTPRequestGetUserInformation();
    }

    @And("user validate response body get user information")
    public void userValidateResponseBodyGetUserInformation() {
        getInform.userValidateResponseBodyGetUserInformation();
    }

    @When("user input bearer token")
    public void inputBearerToken() {
        getInform.userHasApiAuth();
        getInform.userSendRequestBodyAuth();
    }
}
