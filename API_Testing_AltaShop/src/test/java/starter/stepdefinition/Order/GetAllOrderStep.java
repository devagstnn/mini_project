package starter.stepdefinition.Order;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Order.GetAllOrderPage;

public class GetAllOrderStep {

    @Steps
    GetAllOrderPage getAll;
    @Given("user has api endpoint get all order")
    public void userHasApiEndpointGetAllOrder() {
        getAll.apiEndpointGetAllOrder();
    }

    @And("user send HTTP request get all order")
    public void userSendHTTPRequestGetAllOrder() {
        getAll.sendHTTPRequestGetAllOrder();
    }

    @And("user validate response body get all order")
    public void userValidateResponseBodyGetAllOrder() {
        getAll.validateResponseBodyGetAllOrder();
    }
}
