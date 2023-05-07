package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;

public class GetProductByIdPage {

    public static String endpoint ="https://altashop-api.fly.dev/api/products";

    @Step("user has api endpoint get product by id")
    public String apiEndpointGetProductById() {
        return endpoint + "/13425";
    }

    @Step("user send HTTP request get product by id")
    public void sendHTTPRequestGetProductById() {
        SerenityRest.given().get(apiEndpointGetProductById());
    }

    @Step("user validate response body get product by id")
    public void validateResponseBodyGetProductById() {
        restAssuredThat(response -> response.body("data.ID", equalTo(13425)));
        restAssuredThat(response -> response.body("data.Name", equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data.Description", equalTo("Made of high quality pearls")));
        restAssuredThat(response -> response.body("data.Price", equalTo(220)));
        restAssuredThat(response -> response.body("data.Ratings", equalTo(4)));
        restAssuredThat(response -> response.body("data.Categories", empty()));
    }

}
