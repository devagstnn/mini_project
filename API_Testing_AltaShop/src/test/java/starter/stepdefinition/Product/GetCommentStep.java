package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.GetCommentPage;

public class GetCommentStep {

    @Steps
    GetCommentPage getComment;
    @Given("user has api endpoint get product comment")
    public void userHasApiEndpointGetProductComment() {
        getComment.apiEndpointGetProductComment();
    }

    @When("user send HTTP request get product comment")
    public void userSendHTTPRequestGetProductComment() {
        getComment.sendHTTPRequestGetProductComment();
    }

    @And("user validate response body get product comment")
    public void userValidateResponseBodyGetProductComment() {
        getComment.validateResponseBodyGetProductComment();
    }
}
