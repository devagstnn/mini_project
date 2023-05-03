package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By buttonLogin() { return By.xpath("//span[text()='Login']"); }


    //-----locator @TC_Register_001-----\\
    private By clickRegister() { return By.xpath("//a[@href='/auth/register']"); }
    private By inputFullName() { return By.id("input-29");}
    private By inputEmail() { return By.id("input-32"); }
    private By inputPassword() { return By.id("input-35"); }
    private By buttonRegister() { return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']"); }
    private By loginHomepage() { return By.xpath("//div[@class='v-card v-sheet theme--light']"); }


    //-----locator @TC_Register_002-----\\
    private By error() { return By.xpath("//div[@role='alert']"); }





    //-----pages on login page------\\
    @Step("user on login homepage")
    public void onLoginPage() {
        open();
        $(buttonLogin()).waitUntilVisible();
    }


    //--------pages @TC_Register_001 & 003---------\\
    @Step ("user click register")
    public void userClickRegister() { $(clickRegister()).click(); }
    @Step ("user input full name")
    public void userInputfullname(String fullName) { $(inputFullName()).type(fullName); }
    @Step ("user input email")
    public void userInputEmail(String email) { $(inputEmail()).type(email); }
    @Step ("user input password")
    public void userInputPassword(String password) { $(inputPassword()).type(password); }
    @Step ("user click button register")
    public void clickButtonRegister() { $(buttonRegister()).click(); }
    @Step ("user see login homepage")
    public void seeLoginHomepage() { $(loginHomepage()).isDisplayed(); }




    //-------pages @TC_Register_002 & 004-------\\
    @Step("user input Full Name")
    public void inputFullName(String FullName) { $(inputFullName()).type(FullName); }
    @Step("user can see error message")
    public void canSeeErrorMessage() { $(error()).isDisplayed();}
}
