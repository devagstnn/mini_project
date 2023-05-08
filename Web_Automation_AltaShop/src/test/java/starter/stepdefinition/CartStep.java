package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartStep {

    @Steps
    CartPage cart;

    //----------@TC_Cart_001---------\\
    @When("user click the cart")
    public void userClickTheCart() { cart.clickTheCart();}

    @And("user click button plus")
    public void userClickButtonPlus() { cart.clickButtonPlus();}

    @Then("user success add more quantity product")
    public void userSuccessAddMoreQuantityProduct() { cart.addMoreQuantityProduct();}



    //----------@TC_Cart_002---------\\
    @And("user click button Bayar")
    public void userClickButtonBayar() { cart.clickButtonBayar();}

    @Then("the app displays form transaction")
    public void theAppDisplaysFormTransaction() { cart.displaysForm();}



    //----------@TC_Cart_003---------\\
    @And("user click button min")
    public void userClickButtonMin() { cart.clickButtonMin();}

    @Then("user success reduce quantity product")
    public void userSuccessReduceQuantityProduct() { cart.successReduceQuantityProduct();}



    //----------@TC_Cart_004---------\\
    @And("user clicks button min until quantity {int}")
    public void userClicksButtonMinUntilQuantity(int arg0) { cart.clicksButtonMin();}

    @Then("user success delete product from the cart")
    public void userSuccessDeleteProductFromTheCart() { cart.successDeleteProduct();}


    //----------@TC_Cart_005---------\\

    @Then("user see message Order is Empty!")
    public void userSeeMessage() { cart.seeMessage();
    }
}
