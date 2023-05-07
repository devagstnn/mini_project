package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class CartScreen extends BasePageObject {

    private By buttonBeli() { return AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By cart() { return AppiumBy.xpath("//android.widget.Button[@content-desc=\"1\"]");}


    @Step
    public void clickButtonBeli() {
        onClick(buttonBeli());
        onClick(buttonBeli());
    }

    @Step
    public void successToAddToTheCart() { waitUntilClickable(cart()).isDisplayed();}
}
