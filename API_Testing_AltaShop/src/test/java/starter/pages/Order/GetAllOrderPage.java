package starter.pages.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.pages.Authentication.GetUserInformationPage;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllOrderPage {

    @Step("user has api endpoint get all order")
    public String apiEndpointGetAllOrder() {
        return PostNewOrderPage.endpoint;
    }

    @Step("user send HTTP request get all order")
    public void sendHTTPRequestGetAllOrder() {
        SerenityRest.given().header("Authorization","Bearer " + GetUserInformationPage.token).get(apiEndpointGetAllOrder());
    }

    @Step("user validate response body get all order")
    public void validateResponseBodyGetAllOrder() {
        restAssuredThat(response -> response.body("data[0].Product", equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data[0].Price", equalTo(220)));
        restAssuredThat(response -> response.body("data[0].Quantity", equalTo(3)));
        restAssuredThat(response -> response.body("data[0].Subtotal", equalTo(660)));
    }
}
