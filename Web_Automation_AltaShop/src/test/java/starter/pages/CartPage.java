package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    //--------------Locator @TC_Cart_001------------\\
    private By theCart() { return By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']");}
    private By add() { return By.xpath("//span[text()='+']");}
    private By qtyProduct() { return By.xpath("//div[@class='v-main__wrap']");}


    //--------------Locator @TC_Cart_002------------\\
    private By pay() { return By.xpath("//span[text()=' Bayar ']");}
    private By formTransaction() { return By.xpath("//div[@class='container']");}


    //--------------Locator @TC_Cart_003------------\\
    private By reduce() { return By.xpath("//span[text()='-']");}


    //--------------Locator @TC_Cart_004------------\\
    private By message() { return By.xpath("//div[text()=' Order is empty! ']");}

    //--------------Locator @TC_Cart_004------------\\
    private By messageCart() { return By.xpath("//div[text()=' Order is empty! ']");}



    //--------------@TC_Cart_001------------\\

    @Step("user click the cart")
    public void clickTheCart() { $(theCart()).click();}

    @Step("user click button plus")
    public void clickButtonPlus() {
        $(add()).click();
    }

    @Step("user success add more quantity product")
    public void addMoreQuantityProduct() { $(qtyProduct()).isDisplayed();}



    //--------------@TC_Cart_002------------\\
    @Step("user click button Bayar")
    public void clickButtonBayar() { $(pay()).click();}

    @Step("the app displays form transaction")
    public void displaysForm() { $(formTransaction()).isDisplayed();}


    //----------@TC_Cart_003---------\\
    @Step("user click button min")
    public void clickButtonMin() { $(reduce()).click();}

    @Step("user success reduce quantity product")
    public void successReduceQuantityProduct() { $(qtyProduct()).isDisplayed();}


    //----------@TC_Cart_004---------\\
    @Step("user clicks button min until quantity 0")
    public void clicksButtonMin() {
        $(reduce()).click();
        $(reduce()).click();
    }

    @Step("user success delete product from the cart")
    public void successDeleteProduct() { $(message()).isDisplayed();}


    //----------@TC_Cart_005---------\\
    @Step("user see message Order is Empty!")
    public void seeMessage() {
        $(messageCart()).isDisplayed();
    }
}
