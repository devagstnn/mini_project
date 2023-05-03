package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    //------locator @TC_Login_001------\\
    private By emailField() {
        return By.id("input-18");
    }
    private By passwordField() {
        return By.id("input-21");
    }
    private By buttonLogin() {
        return By.xpath("//span[text()='Login']");
    }
    private By productHomepage() { return By.xpath("//div[@class='v-main__wrap']");}

    //------locator @TC_Login_002------\\
    private By errorMessage() { return By.xpath("//div[@class='v-alert__content']"); }


    //------@TC_Login_001------\\
    @Step("user on login page")
    public void onLoginPage() {
        open();
        $(buttonLogin()).waitUntilVisible();
    }

    @Step("user input valid email")
    public void inputValidEmail(String email) { $(emailField()).type(email); }

    @Step("user input valid password")
    public void inputValidPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step("click button login")
    public void clickButtonLogin() {
        $(buttonLogin()).click();
    }

    @Step("user can see product homepage")
    public void canSeeProductHomepage() { $(productHomepage()).isDisplayed(); }


    //-----@TC_Login_002-----\\
    @Step("user input invalid email")
    public void userInputInvalidEmail(String invalidEmail) { $(emailField()).type(invalidEmail); }

    @Step("user see error message")
    public void userSeeErrorMessage(String message) { $(errorMessage()).isDisplayed(); }


    //-----@TC_Login_002-----\\
    @Step("user input invalid password")
    public void userInputInvalidPassword(String invalidPassword) { $(passwordField()).type(invalidPassword); }
}
