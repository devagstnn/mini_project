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
        restAssuredThat(response -> response.body("data[0].ID", equalTo(14482)));
        restAssuredThat(response -> response.body("data[0].Name", equalTo("description")));
        restAssuredThat(response -> response.body("data[0].Description", equalTo("")));
        restAssuredThat(response -> response.body("data[0].Price", equalTo(0)));
        restAssuredThat(response -> response.body("data[0].Ratings", equalTo(5)));
        restAssuredThat(response -> response.body("data[0].Categories", empty()));
    }
}
