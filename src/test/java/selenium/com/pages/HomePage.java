package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.com.base.BasePage;

public class HomePage extends BasePage {
    private final By signInLink = By.cssSelector("a[title='Log in to your customer account']");
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public HomePage load(){
        loadUrl("/");
        return this;
    }

    public SignInPage clickSignInLink(){
        super.click(signInLink);
        return new SignInPage(driver);
    }

}
