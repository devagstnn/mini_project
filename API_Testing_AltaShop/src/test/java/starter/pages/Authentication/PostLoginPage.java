package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostLoginPage {

    public static String endpoint = "https://altashop-api.fly.dev/api/auth";
    @Step("user has api endpoint post login")
    public String apiEndpointPostLogin() {
        return endpoint + "/login";
    }

    @Step("user send request body post login")
    public void sendRequestBodyPostLogin() {
        JSONObject postLogin = new JSONObject();
        postLogin.put("email", "deviagstnn@mail.com");
        postLogin.put("password", "devi1234");

        SerenityRest.given().header("Content-Type","application/json").body(postLogin.toString()).post(apiEndpointPostLogin());

    }

    @Step("user validate response body post login")
    public void validateResponseBodyPostLogin() {
        restAssuredThat(response -> response.body("data", equalTo(GetUserInformationPage.token)));
    }
}
