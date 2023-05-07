package starter.pages.Product;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class GetCommentPage {


    @Step("user has api endpoint get product comment")
    public String apiEndpointGetProductComment() {
        return PostCommentPage.endpoint;
    }

    @Step("user send HTTP request get product comment")
    public void sendHTTPRequestGetProductComment() {
        SerenityRest.given().get(apiEndpointGetProductComment());
    }

    @Step("user validate response body get product comment")
    public void validateResponseBodyGetProductComment() {
        restAssuredThat(response -> response.body("data[0].ID", equalTo(10680)));
        restAssuredThat(response -> response.body("data[0].Content", equalTo("The design is elegant and the carefully selected pearls give it a beautiful sparkle")));
        restAssuredThat(response -> response.body("data[0].User", nullValue()));
        restAssuredThat(response -> response.body("data[0].Product", nullValue()));
        restAssuredThat(response -> response.body("data[0].Comment", nullValue()));
    }
}
