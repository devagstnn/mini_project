package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetAllProductPage {
    public static String endpoint ="https://altashop-api.fly.dev/api";


    @Step("user has api endpoint get all product")
    public String apiEndpointGetAllProduct() {
        return endpoint + "/products";
    }

    @Step("user send HTTP request get all product")
    public void sendHTTPRequestGetAllProduct() {
        SerenityRest.given().header("Content-Type", "application/json").get(apiEndpointGetAllProduct());
    }

    @Step("user validate response body get all product")
    public void validateResponseBodyGetAllProduct() {
        restAssuredThat(response -> response.body("data[1].ID", equalTo(12888)));
        restAssuredThat(response -> response.body("data[1].Name", equalTo("Practical Marble Table")));
        restAssuredThat(response -> response.body("data[1].Description", equalTo("Temporibus sunt asperiores.")));
        restAssuredThat(response -> response.body("data[1].Price", equalTo(82)));
        restAssuredThat(response -> response.body("data[1].Ratings", equalTo(4)));
        restAssuredThat(response -> response.body("data[1].Categories", empty()));
    }
}
