package starter.stepdefinition.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Order.PostNewOrderPage;

public class PostNewOrderStep {
    @Steps
    PostNewOrderPage postorder;
    @Given("user has api endpoint post create new order")
    public void userHasApiEndpointPostCreateNewOrder() {
        postorder.apiEndpointPostCreateNewOrder();

    }

    @And("user send request body post create new order")
    public void userSendRequestBodyPostCreateNewOrder() {
        postorder.sendRequestBodyPostCreateNewOrder();
    }

    @And("user validate response body post create new order")
    public void userValidateResponseBodyPostCreateNewOrder() {
        postorder.validateResponseBodyPostCreateNewOrder();
    }
}
