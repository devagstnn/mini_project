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
        restAssuredThat(response -> response.body("data[2].ID", equalTo(11300)));
        restAssuredThat(response -> response.body("data[2].Name", equalTo("Samsung S23 Ultra")));
        restAssuredThat(response -> response.body("data[2].Description", equalTo("Galaxy")));
        restAssuredThat(response -> response.body("data[2].Price", equalTo(0)));
        restAssuredThat(response -> response.body("data[2].Ratings", equalTo(0)));
        restAssuredThat(response -> response.body("data[2].Categories", empty()));
    }
}
