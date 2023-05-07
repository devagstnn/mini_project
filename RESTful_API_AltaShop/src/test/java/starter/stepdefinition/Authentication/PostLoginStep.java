package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.PostLoginPage;

public class PostLoginStep {

    @Steps
    PostLoginPage postLogin;


    @Given("user has api endpoint post login")
    public void userHasApiEndpointPostLogin() {
        postLogin.apiEndpointPostLogin();
    }

    @When("user send request body post login")
    public void userSendRequestBodyPostLogin() {
        postLogin.sendRequestBodyPostLogin();
    }

    @And("user validate response body post login")
    public void userValidateResponseBodyPostLogin() {
        postLogin.validateResponseBodyPostLogin();
    }

}
