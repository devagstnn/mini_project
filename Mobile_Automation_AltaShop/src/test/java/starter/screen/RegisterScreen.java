package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    //---Locator @TC_Register_001---\\

    private By buttonLogout() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By register() { return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");}
    private By registerView() { return AppiumBy.xpath("//android.view.View[@content-desc=\"Register\"]");}
    private By fullnameField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}
    private By emailField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");}
    private By passwordField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");}
    private By productHomepage() { return AppiumBy.id("android:id/content");}

    //---Locator message error ---\\
    private By messageError() { return AppiumBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");}
    private By messageFullname() { return AppiumBy.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");}
    private By messageEmail() { return AppiumBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");}
    private By messagePassword() { return AppiumBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");}


    //--- @TC_Register_001---\\
    @Step
    public void onHomePage(){
       waitUntilVisible(productHomepage()).isDisplayed();
    }
    @Step
    public void onLoginPage() {
        onClick(buttonLogout());
    }
    @Step
    public void clickRegister() {
        onClick(register());
    }
    @Step
    public void onRegisterPage() {
        waitUntilVisible(registerView()).isDisplayed();
    }
    @Step
    public void inputFullname(String fullname) {
        onClick(fullnameField());
        clear(fullnameField());
        onType(fullnameField(),fullname); }
    @Step
    public void inputEmail(String email){
        onClick(emailField());
        clear(emailField());
        onType(emailField(), email) ;
    }
    @Step
    public void inputPassword(String password){
        onClick(passwordField());
        clear(passwordField());
        onType(passwordField(), password);
    }
    @Step
    public void seeProductHomePage() {
        waitUntilVisible(productHomepage()).isDisplayed();
    }

    //---@TC_Register_002---\\
    @Step
    public void messageErrorRegister() {
        waitUntilVisible(messageError()).isDisplayed();
    }

    //---@TC_Register_003---\\
    @Step
    public void notFillFullname() {
        onClick(fullnameField());
        clear(fullnameField());
        clear(fullnameField());
        onClick(emailField());
    }
    @Step
    public void messageErrorFullname() {
        waitUntilVisible(messageFullname()).isDisplayed();
    }

    //---@TC_Register_004---\\
    @Step
    public void notFillField() {
        notFillFullname();
        onClick(emailField());
        clear(emailField());
        clear(emailField());
        onClick(passwordField());
        clear(passwordField());
    }
    @Step
    public void messageErrorEmail() {
        waitUntilVisible(messageEmail()).isDisplayed();
    }

    public void messgaeErrorPassword(){
        waitUntilVisible(messagePassword()).isDisplayed();
    }

}
