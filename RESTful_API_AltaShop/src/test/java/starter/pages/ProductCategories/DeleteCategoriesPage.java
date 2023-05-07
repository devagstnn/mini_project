package starter.pages.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.nullValue;


public class DeleteCategoriesPage {

    @Step("user has api endpoint delete categories")
    public String apiEndpointDeleteCategories() {
        return PostCategoriesPage.endpoint + "/12814";
    }

    @Step("user send HTTP request delete categories")
    public void sendHTTPRequestDeleteCategories() {
        SerenityRest.given().delete(apiEndpointDeleteCategories());
    }

    @Step("user validate response body delete categories")
    public void validateResponseBodyDeleteCategories() {
        restAssuredThat(response -> response.body("data",nullValue()));
    }
}
