package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegisterPage;

public class RegisterStep {

    @Steps
    RegisterPage register;


    //-----@TC_Register_001-----\\
    @Given("user on login homepage")
    public void userOnLoginHomepage() {
        register.onLoginPage();
    }
    @And("user click register")
    public void userClickRegister() {
        register.userClickRegister(); }
    @When("user input full name")
    public void userInputfullname() {
        register.userInputfullname("Devi Agustin Utari");
    }

    @And("user input email")
    public void userInputEmail() {
        register.userInputEmail("deviagstnn@mail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        register.userInputPassword("devi1234");
    }

    @And("user click button register")
    public void userClickButtonRegister() {
        register.clickButtonRegister();
    }

    @Then("user see login homepage")
    public void userSeeLoginHomepage() {
        register.seeLoginHomepage();
    }

    //------@TC_Register_002------\\
    @When("user input Full Name")
    public void userInputFullName() { register.inputFullName("Utari"); }
    @Then("user can see error message")
    public void userCanSeeErrorMessage() { register.canSeeErrorMessage(); }
}
