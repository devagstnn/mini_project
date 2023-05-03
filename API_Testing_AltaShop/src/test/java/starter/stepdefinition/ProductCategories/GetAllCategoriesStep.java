package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.GetAllCategoriesPage;

public class GetAllCategoriesStep {

    @Steps
    GetAllCategoriesPage getAll;
    @Given("user has api endpoint get all categories")
    public void userHasApiEndpointGetAllCategories() {
        getAll.apiEndpointGetAllCategories();
    }

    @When("user send HTTP request get all categories")
    public void userSendHTTPRequestGetAllCategories() {
        getAll.sendHTTPRequestGetAllCategories();
    }

    @And("user validate response body get all categories")
    public void userValidateResponseBodyGetAllCategories() {
        getAll.validateResponseBodyGetAllCategories();
    }
}
