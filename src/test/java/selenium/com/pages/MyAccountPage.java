package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.com.base.BasePage;

public class MyAccountPage extends BasePage {

    private final By dressLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private final By casualDressLocator = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public CasualDressPage clickCasualDressLink(){
        super.doHover(dressLocator,casualDressLocator);
        return new CasualDressPage(driver);

    }
}
