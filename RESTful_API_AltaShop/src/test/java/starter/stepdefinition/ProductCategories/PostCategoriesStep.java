package starter.stepdefinition.ProductCategories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ProductCategories.PostCategoriesPage;

public class PostCategoriesStep {

    @Steps
    PostCategoriesPage postCategories;

    @Given("user has api endpoint post create categories")
    public void userHasApiEndpointPostCreateCategories() {
        postCategories.apiEndpointPostCreateCategories();
    }

    @When("user send request body post create categories")
    public void userSendRequestBodyPostCreateCategories() {
        postCategories.sendRequestBodyPostCreateCategories();
    }

    @And("user validate response body post create categories")
    public void userValidateResponseBodyPostCreateCategories() {
        postCategories.validateResponseBodyPostCreateCategories();
    }
}
