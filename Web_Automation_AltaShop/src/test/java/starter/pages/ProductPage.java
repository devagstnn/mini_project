package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    //-----------locator @TC_Product_001-----------\\
    private By buttonBeli() { return By.xpath("//div[@id='14391']//span[text()='Beli']"); }
    private By addCart() { return By.xpath("//span[@class='v-badge__wrapper']"); }


    //-----------locator @TC_Product_002-----------\\
    private By buttonDetail() { return By.xpath("//div[@id='14391']//span[text()='Detail']");}
    private By seeDetail() { return By.xpath("//div[@class='v-card__text']");}


    //-----------locator @TC_Product_003-----------\\
    private By addProductRating() { return By.xpath("//button[@aria-label='Rating 3 of 5']");}
    private By productRating() { return By.xpath("//div[@class='v-rating v-rating--dense']");}


    //-----------locator @TC_Product_005-----------\\
    private By categories() { return By.xpath("//div[@class='v-select__selections']");}
    private By selectCategories() { return By.xpath("//div[@class='v-list-item__title']");}
    private By message() { return By.xpath("//div[text()='gaming']");}





    //-------------@TC_Product_001-------------\\
    @Step("user click button Beli")
    public void clickButtonBeli() {
        $(buttonBeli()).click();
        $(buttonBeli()).click();}

    @Step("user success to add product to cart")
    public void addProductToCart() { $(addCart()).isDisplayed();}



    //-------------@TC_Product_002-------------\\
    @Step("user click button Detail")
    public void clickButtonDetail() { $(buttonDetail()).click();}

    @Step("user can see detail product")
    public void seeDetailProduct() { $(seeDetail()).isDisplayed();}


    //-------------@TC_Product_003-------------\\
    @Step("user fills product rating")
    public void fillsProductRating() { $(addProductRating()).click(); }

    @Step("user success add a product rating")
    public void successAddAProductRating() { $(productRating()).isDisplayed();}



    //--------@TC_Product_005-------\\
    @Step("user clicks a dropdown category")
    public void clicksADropdownCategory() { $(categories()).click();}

    @Step("user clicks one of the categories")
    public void clicksOneOfTheCategories() { $(selectCategories()).click();}

    @Step("user can see message")
    public void seeMessage(String message) { $(message()).isDisplayed();}
}
