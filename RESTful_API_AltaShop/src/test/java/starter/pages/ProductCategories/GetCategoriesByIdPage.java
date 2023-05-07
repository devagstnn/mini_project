package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategoriesByIdPage {

    @Step("user has api endpoint get categories by id")
    public String apiEndpointGetCategoriesById() {
        return PostCategoriesPage.endpoint + "/12817";
    }

    @Step("user send HTTP request get categories by id")
    public void sendHTTPRequestGetCategoriesById() {
        SerenityRest.given().get(apiEndpointGetCategoriesById());
    }

    @Step("user validate response body get categories by id")
    public void validateResponseBodyGetCategoriesById() {
        restAssuredThat(response -> response.body("data.ID", equalTo(12817)));
        restAssuredThat(response -> response.body("data.Name", equalTo("Accessories")));
        restAssuredThat(response -> response.body("data.Description", equalTo("to enhance appearance")));
    }
}
