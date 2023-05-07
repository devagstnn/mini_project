package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.GetAllProductPage;

public class GetAllProductStep {

    @Steps
    GetAllProductPage getProduct;
    @Given("user has api endpoint get all product")
    public void userHasApiEndpointGetAllProduct() {
        getProduct.apiEndpointGetAllProduct();
    }

    @When("user send HTTP request get all product")
    public void userSendHTTPRequestGetAllProduct() {
        getProduct.sendHTTPRequestGetAllProduct();
    }


    @And("user validate response body get all product")
    public void userValidateResponseBodyGetAllProduct() {
        getProduct.validateResponseBodyGetAllProduct();
    }


}
