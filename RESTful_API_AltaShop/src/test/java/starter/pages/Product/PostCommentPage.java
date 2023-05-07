package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.pages.Authentication.GetUserInformationPage;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;

public class PostCommentPage {

    public static String endpoint = "https://altashop-api.fly.dev/api/products/13425/comments";

    @Step("user has api endpoint post create comment")
    public String apiEndpointPostCreateComment() {
        return endpoint;
    }

    @Step("user send request body post create comment")
    public void sendRequestBodyPostCreateComment() {
        JSONObject body = new JSONObject();
        body.put("content", "The design is elegant and the carefully selected pearls give it a beautiful sparkle");

        SerenityRest.given().header("Authorization", "Bearer " + GetUserInformationPage.token).body(body.toString()).post(apiEndpointPostCreateComment());
    }

    @Step("user validate response post create comment")
    public void validateResponsePostCreateComment() {
        restAssuredThat(response -> response.body("data.Content", equalTo("The design is elegant and the carefully selected pearls give it a beautiful sparkle")));
        restAssuredThat(response -> response.body("data.User", nullValue()));
        restAssuredThat(response -> response.body("data.Product", nullValue()));
        restAssuredThat(response -> response.body("data.Comment", nullValue()));

    }
}
