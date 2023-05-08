package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogoutPage;

public class LogoutStep {

    @Steps
    LogoutPage logout;
    @When("user click profil")
    public void userClickProfil() {
        logout.clickProfil();
    }

    @And("user click logout")
    public void userClickLogout() {
        logout.clickLogout();
    }
}
