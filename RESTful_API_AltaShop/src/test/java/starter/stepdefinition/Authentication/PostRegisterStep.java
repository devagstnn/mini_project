package starter.stepdefinition.Authentication;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Authentication.PostRegisterPage;

public class PostRegisterStep {

    @Steps
    PostRegisterPage postReg;

    //--- Stepdefinition Post Register ---//
    @Given("user has api endpoint post register")
    public void userHasApiEndpointPostRegister() {
        postReg.hasAPIEndpointPostRegister();
    }

    @When("user send request body post register")
    public void userSendRequestBodyPostRegister() {
        postReg.sendRequestBodyPostRegister();
    }

    @Then("user receive response code {int}")
    public void userReceiveResponseCode(int arg0) {
        postReg.receiveResponseCode();
    }

    @And("user validate response body post register")
    public void userValidateResponseBodyPostRegister() {
        postReg.validateResponseBodyPostRegister();
    }
}
