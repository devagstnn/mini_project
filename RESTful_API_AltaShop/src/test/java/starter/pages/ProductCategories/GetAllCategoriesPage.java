package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllCategoriesPage {

    @Step("user has api endpoint get all categories")
    public String apiEndpointGetAllCategories() {
        return PostCategoriesPage.endpoint;
    }

    @Step("user send HTTPrequest get all categories")
    public void sendHTTPRequestGetAllCategories() {
        SerenityRest.given().get(apiEndpointGetAllCategories());
    }

    @Step("user validate response body get all categories")
    public void validateResponseBodyGetAllCategories() {
        restAssuredThat(response -> response.body("data[0].ID", equalTo(12502)));
        restAssuredThat(response -> response.body("data[0].Name", equalTo("gaming")));
        restAssuredThat(response -> response.body("data[0].Description", equalTo("for gaming purposes")));
    }
}
