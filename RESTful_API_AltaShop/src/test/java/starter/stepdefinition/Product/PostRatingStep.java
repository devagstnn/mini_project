package starter.stepdefinition.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.pages.Product.PostRatingPage;

public class PostRatingStep {

    @Steps
    PostRatingPage postRating;
    @Given("user has api endpoint post product rating")
    public void userHasApiEndpointPostProductRating() {
        postRating.apiEndpointPostProductRating();
    }


    @And("user send request body post product rating")
    public void userSendRequestBodyPostProductRating() {
        postRating.userSendRequestBodyPostProductRating();
    }

    @And("user validate response post product rating")
    public void userValidateResponsePostProductRating() {
        postRating.userValidateResponsePostProductRating();
    }
}
