package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.DeleteCategoriesPage;

public class DeleteCategoriesStep {

    @Steps
    DeleteCategoriesPage delete;
    @Given("user has api endpoint delete categories")
    public void userHasApiEndpointDeleteCategories() {
        delete.apiEndpointDeleteCategories();

    }

    @When("user send HTTP request delete categories")
    public void userSendHTTPRequestDeleteCategories() {
        delete.sendHTTPRequestDeleteCategories();
    }

    @And("user validate response body delete categories")
    public void userValidateResponseBodyDeleteCategories() {
        delete.validateResponseBodyDeleteCategories();
    }
}
