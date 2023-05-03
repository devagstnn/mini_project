package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.pages.Authentication.GetUserInformationPage;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;


public class PostRatingPage {

    public static String endpoint ="https://altashop-api.fly.dev/api/products/11691/ratings";
    public static int rating = 4;

    @Step("user has api endpoint post product rating")
    public String apiEndpointPostProductRating() {
        return endpoint;
    }


    @Step("user send request body post product rating")
    public void userSendRequestBodyPostProductRating() {
        JSONObject body = new JSONObject();
        body.put("count", rating);
        SerenityRest.given().header("Authorization","Bearer " + GetUserInformationPage.token).body(body.toString()).post(apiEndpointPostProductRating());
    }

    @Step("user validate response post product rating")
    public void userValidateResponsePostProductRating() {
        restAssuredThat(response -> response.body("data.ID", equalTo(11691)));
        restAssuredThat(response -> response.body("data.Name", equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data.Description", equalTo("Made of high quality pearls")));
        restAssuredThat(response -> response.body("data.Price", equalTo(220)));
        restAssuredThat(response -> response.body("data.Ratings", equalTo(rating)));
        restAssuredThat(response -> response.body("data.Categories", empty()));

    }
}
