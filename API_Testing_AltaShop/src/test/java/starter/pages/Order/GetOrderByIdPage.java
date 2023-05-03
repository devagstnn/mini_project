package starter.pages.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.pages.Authentication.GetUserInformationPage;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;

public class GetOrderByIdPage {

    @Step("user has api endpoint get order by id")
    public String apiEndpointGetOrderById() {
        return PostNewOrderPage.endpoint + "/9904";
    }

    @Step("user send request body get order by id")
    public void sendRequestBodyGetOrderById() {
        SerenityRest.given().header("Authorization","Bearer " + GetUserInformationPage.token)
                .get(apiEndpointGetOrderById());
    }

    @Step("user validate response body get order by id")
    public void validateResponseBodyGetOrderById() {
        restAssuredThat(response -> response.body("data.ID",equalTo(9904)));

        restAssuredThat(response -> response.body("data.User.ID",equalTo(15554)));
        restAssuredThat(response -> response.body("data.User.Fullname",equalTo("Devi Agustin Utari")));
        restAssuredThat(response -> response.body("data.User.Email",equalTo("deviagstnn@mail.com")));
        restAssuredThat(response -> response.body("data.User.Password",equalTo("devi1234")));

        restAssuredThat(response -> response.body("data.Product.ID",equalTo(11691)));
        restAssuredThat(response -> response.body("data.Product.Name",equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data.Product.Description",equalTo("Made of high quality pearls")));
        restAssuredThat(response -> response.body("data.Product.Price",equalTo(220)));
        restAssuredThat(response -> response.body("data.Product.Ratings",equalTo(0)));
        restAssuredThat(response -> response.body("data.Product.Categories", empty()));

        restAssuredThat(response -> response.body("data.Quantity",equalTo(3)));

    }
}
