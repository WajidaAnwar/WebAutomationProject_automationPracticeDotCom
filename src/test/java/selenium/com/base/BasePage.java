package selenium.com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected ExpectedCondition<WebElement> condition;


    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public void loadUrl(String endpoint){
        driver.get("http://automationpractice.com/" + endpoint);
    }


    public By getLocator(String name){
        return By.xpath("//option[text()='"+name+"']");
    }

    public WebElement isClickable(By locator){
        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public void clickByPresence(By locator){
        condition = ExpectedConditions.presenceOfElementLocated(locator);
        wait.until(condition).click();
    }

    public void click(By locator){
        WebElement webElement = isClickable(locator);
        webElement.click();
    }



    public WebElement getByVisibility(By locator){
        condition = ExpectedConditions.visibilityOfElementLocated(locator);
        return wait.until(condition);
    }


    public void doHover(By locator, By subLocator){
        Actions actions = new Actions(driver);
        condition = ExpectedConditions.presenceOfElementLocated(locator);
        WebElement element = wait.until(condition);
        actions.moveToElement(element).perform();
        condition = ExpectedConditions.elementToBeClickable(subLocator);
        WebElement subElement = wait.until(condition);
        actions.moveToElement(subElement).click().perform();
    }

    public void addToCart(By locator, By subLocator, By popLocator){
        doHover(locator, subLocator);
        click(popLocator);

    }

}