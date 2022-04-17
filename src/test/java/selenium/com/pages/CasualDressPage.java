package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.com.base.BasePage;

public class CasualDressPage extends BasePage {
    private final By dressItemLocator = By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
    private final By addToCartDress = By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private final By crossPopUp = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > span");

    private final By tshirtLocator =  By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    public CasualDressPage(WebDriver driver) {
        super(driver);
    }

    public CasualDressPage addDress(){
        super.addToCart(dressItemLocator,addToCartDress,crossPopUp);
        return this;
    }

    public TShirtPage clickTShirtLink(){
        super.click(tshirtLocator);
        return new TShirtPage(driver);
    }

}
