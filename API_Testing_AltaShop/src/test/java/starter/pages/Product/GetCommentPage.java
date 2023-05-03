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
        restAssuredThat(response -> response.body("data[0].ID", equalTo(10122)));
        restAssuredThat(response -> response.body("data[0].Content", equalTo("the games are great including Gran Turismo 7 but sadly GT4 is much better")));
        restAssuredThat(response -> response.body("data[0].User", nullValue()));
        restAssuredThat(response -> response.body("data[0].Product", nullValue()));
        restAssuredThat(response -> response.body("data[0].Comment", nullValue()));
    }
}
