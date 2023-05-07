package starter.pages.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class DeleteProductPage {

    public static String endpoint ="https://altashop-api.fly.dev/api/products";
    @Step("user has api endpoint delete product")
    public String apiEndpointDeleteProduct() {
        return endpoint + "/13428";
    }

    @Step("user send HTTP request delete product")
    public void sendHTTPRequestDeleteProduct() {
        SerenityRest.given().delete(apiEndpointDeleteProduct());
    }

    @Step("user validate response body delete product")
    public void validateResponseBodyDeleteProduct() {
        restAssuredThat(response -> response.body("data",nullValue()));
    }



}
