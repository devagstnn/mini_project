package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    //--------------Locator @TC_Logout_001------------\\
    private By profilButton() { return By.xpath("//i[@class='v-icon notranslate fas fa-user theme--dark']");}
    private By logoutButton() { return By.xpath("//div[text()=' Logout ']");}

    @Step("user click profil")
    public void clickProfil() {
        $(profilButton()).click();

    }

    @Step("user click logout")
    public void clickLogout() {
        $(logoutButton()).click();
    }

}
