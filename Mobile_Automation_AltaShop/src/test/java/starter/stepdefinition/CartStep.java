package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.ProductScreen;
import starter.screen.LoginScreen;

public class CartStep {

    @Steps
    ProductScreen cart;

    @Steps
    LoginScreen login;
    @And("user on product page")
    public void userOnProductPage() {
        login.seeHomePage();
    }

    @When("user select button Beli")
    public void userSelectButtonBeli() {
        cart.clickButtonBeli();
    }

    @Then("user success add product to the cart")
    public void userSuccessAddProductToTheCart() {
        cart.successToAddToTheCart();
    }
}
