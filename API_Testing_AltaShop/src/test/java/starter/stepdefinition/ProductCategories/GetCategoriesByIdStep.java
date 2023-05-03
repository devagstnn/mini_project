package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.GetCategoriesByIdPage;

public class GetCategoriesByIdStep {

    @Steps
    GetCategoriesByIdPage getById;
    @Given("user has api endpoint get categories by id")
    public void userHasApiEndpointGetCategoriesById() {
        getById.apiEndpointGetCategoriesById();
    }

    @When("user send HTTP request get categories by id")
    public void userSendHTTPRequestGetCategoriesById() {
        getById.sendHTTPRequestGetCategoriesById();
    }

    @And("user validate response body get categories by id")
    public void userValidateResponseBodyGetCategoriesById() {
        getById.validateResponseBodyGetCategoriesById();
    }
}
