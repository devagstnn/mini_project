package starter.stepdefinition.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Order.GetOrderByIdPage;

public class GetOrderByIdStep {

    @Steps
    GetOrderByIdPage getOrderId;
    @Given("user has api endpoint get order by id")
    public void userHasApiEndpointGetOrderById() {
        getOrderId.apiEndpointGetOrderById();
    }

    @And("user send request body get order by id")
    public void userSendRequestBodyGetOrderById() {
        getOrderId.sendRequestBodyGetOrderById();
    }

    @And("user validate response body get order by id")
    public void userValidateResponseBodyGetOrderById() {
        getOrderId.validateResponseBodyGetOrderById();
    }
}
