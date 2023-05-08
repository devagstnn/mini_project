package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage login;

    //-----@TC_login_001-----\\
    @Given("user on login page")
    public void userOnLoginPage() { login.onLoginPage(); }

    @When("user input valid email")
    public void userInputValidEmail() { login.inputValidEmail("deviagstnn@mail.com"); }

    @And("user input valid password")
    public void userInputValidPassword() { login.inputValidPassword("devi1234"); }

    @And("click button login")
    public void clickButtonLogin() { login.clickButtonLogin(); }

    @Then("user can see product homepage")
    public void userCanSeeProductHomepage() { login.canSeeProductHomepage(); }



    //------@TC_Login_002------\\
    @When("user input invalid email")
    public void userInputInvalidEmail() { login.userInputInvalidEmail("user@mail.com"); }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) { login.userSeeErrorMessage("record not found"); }


    //-----@TC_Login_003------\\
    @And("user input invalid password")
    public void userInputInvalidPassword() { login.userInputInvalidPassword("user"); }



    @Given("user success login")
    public void userSuccessLogin() {
        login.onLoginPage();
        login.inputValidEmail("deviagstnn@mail.com");
        login.inputValidPassword("devi1234");
        login.clickButtonLogin();
        login.canSeeProductHomepage();
    }
}
