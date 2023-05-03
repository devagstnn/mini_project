package starter.pages.Order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.pages.Authentication.GetUserInformationPage;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;

public class PostNewOrderPage {

    public static String endpoint = "https://altashop-api.fly.dev/api/orders";


    @Step("user has api endpoint post create new order")
    public String apiEndpointPostCreateNewOrder() {
        return endpoint;
    }

    @Step("user send request body post create new order")
    public void sendRequestBodyPostCreateNewOrder() {
        JSONObject body = new JSONObject();
        body.put("product_id", 11691);
        body.put("quantity", 3);

        SerenityRest.given().header("Authorization","Bearer " + GetUserInformationPage.token)
                .body("[\n" + body.toString() + "\n]").post(apiEndpointPostCreateNewOrder());

    }

    @Step("user validate response body post create new order")
    public void validateResponseBodyPostCreateNewOrder() {
        restAssuredThat(response -> response.body("data[0].User.ID",equalTo(15554)));
        restAssuredThat(response -> response.body("data[0].User.Fullname",equalTo("Devi Agustin Utari")));
        restAssuredThat(response -> response.body("data[0].User.Email",equalTo("deviagstnn@mail.com")));
        restAssuredThat(response -> response.body("data[0].User.Password",equalTo("devi1234")));

        restAssuredThat(response -> response.body("data[0].Product.ID",equalTo(11691)));
        restAssuredThat(response -> response.body("data[0].Product.Name",equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data[0].Product.Description",equalTo("Made of high quality pearls")));
        restAssuredThat(response -> response.body("data[0].Product.Price",equalTo(220)));
        restAssuredThat(response -> response.body("data[0].Product.Ratings",equalTo(0)));
        restAssuredThat(response -> response.body("data[0].Product.Categories", empty()));

        restAssuredThat(response -> response.body("data[0].Quantity",equalTo(3)));
    }
}
