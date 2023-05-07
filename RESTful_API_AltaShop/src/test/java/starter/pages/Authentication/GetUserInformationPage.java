package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class GetUserInformationPage {

    protected String email = "deviagstnn@mail.com";
    protected String password = "devi1234";

    public static String endpoint = "https://altashop-api.fly.dev/api/auth";

    public static String token = "";

    @Step("user has api auth")
    public String userHasApiAuth() {
       return endpoint + "/login";
    }

    @Step("user send request body auth")
    public void userSendRequestBodyAuth() {
        String body = "{\n"     +
                "         \"email\":" + email +",\n " +
                "         \"password\":" + password +",\n " +
                "}";

        JSONObject reqbody = new JSONObject(body);
        SerenityRest.given().header("Content-Type","application/json").body(reqbody.toString()).post(userHasApiAuth());
        token = lastResponse().getBody().jsonPath().get("data");
}

    @Step("user has api endpoint get user information")
    public String apiEndpointGetUserInformation() { return endpoint + "/info";

    }

    @Step("user send HTTP request get user information")
    public void sendHTTPRequestGetUserInformation() {
        SerenityRest.given().header("Authorization","Bearer " + token).get(apiEndpointGetUserInformation());
    }

    @Step("user validate response body get user information")
    public void userValidateResponseBodyGetUserInformation() {
        restAssuredThat(response -> response.body("data.ID", equalTo(18559)));
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Devi Agustin Utari")));
        restAssuredThat(response -> response.body("data.Email", equalTo("deviagstnn@mail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("devi1234")));
    }

}
