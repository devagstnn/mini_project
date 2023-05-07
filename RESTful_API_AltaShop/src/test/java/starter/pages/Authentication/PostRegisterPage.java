package starter.pages.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PostRegisterPage {
    public static String endpoint = "https://altashop-api.fly.dev/api/auth";

    @Step("user has api endpoint post register")
    public String hasAPIEndpointPostRegister() { return endpoint + "/register"; }

    @Step("user send request body post register")
    public void sendRequestBodyPostRegister(){
        JSONObject register = new JSONObject();
        register.put("email","deviagstnn@mail.com");
        register.put("password","devi1234");
        register.put("fullname","Devi Agustin Utari");

        SerenityRest.given().header("Content-Type","application/json").body(register.toString()).post(hasAPIEndpointPostRegister());
    }

    @Step("user receive response code 200")
    public void receiveResponseCode() { restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user validate response body post register")
    public void validateResponseBodyPostRegister() {
        restAssuredThat(response -> response.body("data.Email", equalTo("deviagstnn@mail.com")));
        restAssuredThat(response -> response.body("data.Password", equalTo("devi1234")));
        restAssuredThat(response -> response.body("data.Fullname", equalTo("Devi Agustin Utari")));
    }

}
