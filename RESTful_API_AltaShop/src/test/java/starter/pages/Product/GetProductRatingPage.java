package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GetProductRatingPage {
    

    @Step("user has api endpoint get product rating")
    public String apiEndpointGetProductRating() {
        return PostRatingPage.endpoint;
    }

    @Step("user send HTTP request get product rating")
    public void sendHTTPRequestGetProductRating() {
        SerenityRest.given().get(apiEndpointGetProductRating());
    }

    @Step("user validate response get product rating")
    public void validateResponseGetProductRating() {
        restAssuredThat(response -> response.body("data", equalTo(PostRatingPage.rating)));
    }
}
