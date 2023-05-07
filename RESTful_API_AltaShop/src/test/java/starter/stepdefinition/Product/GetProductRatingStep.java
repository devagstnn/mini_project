package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.GetProductRatingPage;

public class GetProductRatingStep {

    @Steps
    GetProductRatingPage getProduct;
    @Given("user has api endpoint get product rating")
    public void userHasApiEndpointGetProductRating() {
        getProduct.apiEndpointGetProductRating();
    }

    @And("user send HTTP request get product rating")
    public void userSendHTTPRequestGetProductRating() {
        getProduct.sendHTTPRequestGetProductRating();
    }

    @And("user validate response get product rating")
    public void userValidateResponseGetProductRating() {
        getProduct.validateResponseGetProductRating();
    }
}
