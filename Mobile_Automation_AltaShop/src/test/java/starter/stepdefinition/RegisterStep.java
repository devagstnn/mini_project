package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.RegisterScreen;

public class RegisterStep {

    @Steps
    RegisterScreen register;

    //---@TC_Register_001---\\

    @Given("user on home page")
    public void userClickIconLogout() {
        register.onHomePage();
    }

    @And("user on login page")
    public void userOnLoginPage() {
        register.onLoginPage();
    }

    @And("user click register feature")
    public void userClickRegisterFeature() {
        register.clickRegister();
    }

    @And("user on register page")
    public void userOnRegisterHomepage() {
        register.onRegisterPage();
    }

    @When("user input fullname")
    public void userInputFullname() {
        register.inputFullname("Devi Agustin Utari");
    }

    @And("user input email")
    public void userInputEmail() {
        register.inputEmail("deviagstnn@mail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        register.inputPassword("devi1234");
    }

    @And("user click button register")
    public void userClickButtonRegister() {
        register.clickRegister();
    }

    @Then("user see product homepage")
    public void userSeeProductHomepage() {
        register.seeProductHomePage();
    }


    //---@TC_MRegister_002---\\

    @When("user input new fullname")
    public void userInputNewFullname() {
        register.inputFullname("Utari");
    }

    @And("user input new password")
    public void userInputNewPassword() {
        register.inputPassword("utari1234");
    }
    @Then("user see error message")
    public void userSeeErrorMessage() {
        register.messageErrorRegister();
    }



    //---@TC_MRegister_003---\\
    @When("user not fill fullname")
    public void userNotFillFullname() {
        register.notFillFullname();
    }
    @Then("user see message in fullname field {string}")
    public void userSeeMessageInFullnameField(String arg0) {
        register.messageErrorFullname();
    }



    //---@TC_MRegister_004---\\
    @When("user not fill fullname, email, password field")
    public void userNotFillFullnameEmailPasswordField() {
        register.notFillField();
    }
    @Then("user see message in every field")
    public void userSeeMessageInEveryField() {
        register.messageErrorFullname();
        register.messageErrorEmail();
        register.messgaeErrorPassword();
    }


}
