package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginStep {

    @Steps
    LoginScreen login;


    //----@TC_Login_001----\\
    @Given("user on login homepage")
    public void userOnLoginHomepage() {
        login.onLoginPage();
    }
    @When("user input valid email")
    public void userInputValidEmail() {
        login.inputEmail("deviagstnn@mail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        login.inputPassword("devi1234");
    }

    @And("click button login")
    public void clickButtonLogin() {
        login.clickButtonLogin();
    }

    @Then("user can see product homepage")
    public void userCanSeeProductHomepage() {
        login.seeHomePage();
    }


    //---@TC_Login_002---\\
    @When("user input invalid email")
    public void userInputInvalidEmail() {
        login.invalidEmail("user@mail.com");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
        login.errorMessage();
    }


    //---@TC_Login_003---\\
    @Then("user see message in password field {string}")
    public void userSeeMessageInPasswordField(String arg0) {
        login.messageNotEmptyInPasswordField();
    }

    @Then("user see  message in email field{string}")
    public void userSeeMessageInEmailField(String arg0) {
        login.messageNotEmptyInEmailField();
    }


    @Given("user success login")
    public void userSuccessLogin() {
        login.onLoginPage();
        login.inputEmail("deviagstnn@mail.com");
        login.inputPassword("devi1234");
        login.clickButtonLogin();
    }
}
