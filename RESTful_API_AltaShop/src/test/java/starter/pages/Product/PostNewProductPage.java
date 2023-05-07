package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONArray;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class PostNewProductPage {

    public static String endpoint ="https://altashop-api.fly.dev/api";


    @Step("user has api endpoint post create new product")
    public String apiEndpointPostCreateNewProduct() {
        return endpoint + "/products";
    }

    @Step("user send request body post create new product")
    public void sendRequestBodyPostCreateNewProduct() {
        JSONObject postcreate = new JSONObject();
        postcreate.put("name", "Bracelet");
        postcreate.put("description", "Made of high quality pearls");
        postcreate.put("price", 220);
        postcreate.put("categories", new JSONArray());


        SerenityRest.given().header("Content-Type","application/json").body(postcreate.toString()).post(apiEndpointPostCreateNewProduct());
    }

    @Step("user validate response body post create new product")
    public void validateResponseBodyPostCreateNewProduct() {
        restAssuredThat(response -> response.body("data.Name", equalTo("Bracelet")));
        restAssuredThat(response -> response.body("data.Description", equalTo("Made of high quality pearls")));
        restAssuredThat(response -> response.body("data.Price", equalTo(220)));
        restAssuredThat(response -> response.body("data.Ratings", equalTo(0)));


    }


}
