package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    //---Locator @TC_Login_001---\\
    private By buttonLogout() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By loginView() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");}
    private By inputEmail() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}
    private By inputPassword() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");}
    private By buttonLogin() { return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");}
    private By homePage() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout");}


    //---Locator @TC_Login_002---\\
    private By messageInvalid() { return AppiumBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");}


    //---Locator @TC_Login_003---\\
    private By message() { return AppiumBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");}


    //---Locator @TC_Login_004---\\
    private By messages() { return AppiumBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");}

    //----@TC_Login_001----\\
    @Step
    public void onLoginPage() {
        onClick(buttonLogout());
        waitUntilPresence(loginView()).isDisplayed();


    }
    @Step
    public void inputEmail(String email) {
        onClick(inputEmail());
        onClick(inputEmail());
        onType(inputEmail(), email);
    }
    @Step
    public void inputPassword(String password) {
        onClick(inputPassword());
        onClick(inputPassword());
        onType(inputPassword(),password);
    }
    @Step
    public void clickButtonLogin() {
        onClick(buttonLogin());
    }
    @Step
    public void seeHomePage() {
        waitUntilVisible(homePage()).isDisplayed();
    }

    //---@TC_Login_002---\\
    @Step
    public void invalidEmail(String email) {
        onClick(inputEmail());
        onType(inputEmail(), email);
    }

    @Step
    public void errorMessage() { waitUntilVisible(messageInvalid()).isDisplayed(); }


    //---@TC_Login_003---\\
    @Step
    public void messageNotEmptyInPasswordField() {
        waitUntilVisible(message()).isDisplayed();
    }


    //---@TC_Login_004---\\
    @Step
    public void messageNotEmptyInEmailField() {
        waitUntilVisible(messages()).isDisplayed();
    }
}

