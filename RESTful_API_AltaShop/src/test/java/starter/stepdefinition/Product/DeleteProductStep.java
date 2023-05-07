package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.DeleteProductPage;

public class DeleteProductStep {

    @Steps
    DeleteProductPage deleteProduct;
    @Given("user has api endpoint delete product")
    public void userHasApiEndpointDeleteProduct() {
        deleteProduct.apiEndpointDeleteProduct();
    }

    @When("user send HTTP request delete product")
    public void userSendHTTPRequestDeleteProduct() {
        deleteProduct.sendHTTPRequestDeleteProduct();
    }

    @And("user validate response body delete product")
    public void userValidateResponseBodyDeleteProduct() {
        deleteProduct.validateResponseBodyDeleteProduct();
    }
}
