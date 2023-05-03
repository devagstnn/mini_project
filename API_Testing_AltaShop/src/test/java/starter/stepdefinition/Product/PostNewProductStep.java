package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.PostNewProductPage;

public class PostNewProductStep {

    @Steps
    PostNewProductPage postProduct;

    @Given("user has api endpoint post create new product")
    public void userHasApiEndpointPostCreateNewProduct() {
        postProduct.apiEndpointPostCreateNewProduct();
    }

    @When("user send request body post create new product")
    public void userSendRequestBodyPostCreateNewProduct() {
        postProduct.sendRequestBodyPostCreateNewProduct();
    }

    @And("user validate response body post create new product")
    public void userValidateResponseBodyPostCreateNewProduct() {
        postProduct.validateResponseBodyPostCreateNewProduct();
    }

}
