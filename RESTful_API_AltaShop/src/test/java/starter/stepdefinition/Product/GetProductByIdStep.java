package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.GetProductByIdPage;

public class GetProductByIdStep {

  @Steps
    GetProductByIdPage getProduct;

    @Given("user has api endpoint get product by id")
    public void userHasApiEndpointGetProductById() {
        getProduct.apiEndpointGetProductById();
    }

    @When("user send HTTP request get product by id")
    public void userSendHTTPRequestGetProductById() {
        getProduct.sendHTTPRequestGetProductById();
    }

    @And("user validate response body get product by id")
    public void userValidateResponseBodyGetProductById() {
        getProduct.validateResponseBodyGetProductById();
    }

}
