package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pages.Product;

public class ProductSteps {

    @Steps
    Product product;

    //------@TC_Product_001------\\
    @When("user click button Beli")
    public void userClickButtonBeli() {
        product.clickButtonBeli();
    }

    @Then("user success to add product to cart")
    public void userSuccessToAddProductToCart() {
        product.addProductToCart();
    }


    //--------@TC_Product_002-------\\
    @When("user click button Detail")
    public void userClickButtonDetail() {
        product.clickButtonDetail();
    }

    @Then("user can see detail product")
    public void userCanSeeDetailProduct() {
        product.seeDetailProduct();
    }


    //--------@TC_Product_003-------\\
    @And("user fills product rating")
    public void userFillsProductRating() {
        product.fillsProductRating();
    }

    @Then("user success add a product rating")
    public void userSuccessAddAProductRating() {
        product.successAddAProductRating();
    }


    //--------@TC_Product_005-------\\
    @When("user clicks a dropdown category")
    public void userClicksADropdownCategory() { product.clicksADropdownCategory();}

    @And("user clicks one of the categories")
    public void userClicksOneOfTheCategories() { product.clicksOneOfTheCategories();}

    @Then("user can see message {string}")
    public void userCanSeeMessage(String arg0) { product.seeMessage("Products is empty!");
    }



    @Given("user success add product to the cart")
    public void successAddProductToTheCart() {
        product.clickButtonBeli();
        product.clickButtonBeli();
        product.addProductToCart();
    }
}
