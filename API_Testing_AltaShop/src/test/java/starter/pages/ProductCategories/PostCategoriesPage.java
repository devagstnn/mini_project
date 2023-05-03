package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostCategoriesPage {

    public static String endpoint = "https://altashop-api.fly.dev/api/categories";


    @Step("user has api endpoint post create categories")
    public String apiEndpointPostCreateCategories() {
        return endpoint;
    }

    @Step("user send request body post create categories")
    public void sendRequestBodyPostCreateCategories() {
        JSONObject body = new JSONObject();
        body.put("name", "Accessories");
        body.put("description", "to enhance appearance");

        SerenityRest.given().header("Content-Type", "application/json").body(body.toString()).post(apiEndpointPostCreateCategories());
    }

    @Step("user validate response body post create categories")
    public void validateResponseBodyPostCreateCategories() {
        restAssuredThat(response -> response.body("data.Name", equalTo("Accessories")));
        restAssuredThat(response -> response.body("data.Description", equalTo("to enhance appearance")));
    }
}
