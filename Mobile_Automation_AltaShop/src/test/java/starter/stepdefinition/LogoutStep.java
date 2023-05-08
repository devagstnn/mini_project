package starter.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LogoutScreen;

public class LogoutStep {

    @Steps
    LogoutScreen logout;
    @When("user click button logout")
    public void userClickButtonLogout() {
        logout.clickButtonLogout();
    }

    @Then("user see home page")
    public void userSeeHomePage() {
        logout.onHomePage();
    }
}
