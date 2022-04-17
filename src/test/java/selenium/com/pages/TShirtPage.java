package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.com.base.BasePage;

public class TShirtPage extends BasePage {
    private final By blueFilterLocator = By.id("layered_id_attribute_group_14");
    private final By tShirtItem = By.cssSelector(".right-block");
    private final By blueColorLocator = By.cssSelector("#color_2");
    private final By addToCartLocator = By.cssSelector("#add_to_cart > button");
    private final By crossPopUp = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > span");



    private final By cartLocator = By.cssSelector("a[title='View my shopping cart']");
    private final By checkOutButtonLocator = By.cssSelector("#button_order_cart > span");
    public TShirtPage(WebDriver driver) {
        super(driver);
    }

    public TShirtPage addShirt(){
        super.click(blueFilterLocator);
        super.doHover(tShirtItem, blueColorLocator);
        super.click(addToCartLocator);
        super.click(crossPopUp);
        return this;
    }

    public CheckOutPage navigateToCheckout(){
        super.doHover(cartLocator, checkOutButtonLocator);
        return new CheckOutPage(driver);
    }
}
