package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.PostCommentPage;

public class PostCommentStep {

    @Steps
    PostCommentPage postComment;
    @Given("user has api endpoint post create comment")
    public void userHasApiEndpointPostCreateComment() {
        postComment.apiEndpointPostCreateComment();
    }

    @And("user send request body post create comment")
    public void userSendRequestBodyPostCreateComment() {
        postComment.sendRequestBodyPostCreateComment();
    }

    @And("user validate response post create comment")
    public void userValidateResponsePostCreateComment() {
        postComment.validateResponsePostCreateComment();
    }
}
