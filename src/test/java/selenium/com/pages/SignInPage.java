package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.com.base.BasePage;

public class SignInPage extends BasePage {

    private final By userEmailLocator       = By.id("email");
    private final By userPasswordLocator    = By.id("passwd");
    private final By loginButtonLocator     = By.id("SubmitLogin");

    private final By emailRegisterLocator     = By.id("email_create");
    private final By registerButtonLocator    = By.id("SubmitCreate");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private SignInPage enterEmail(String email){
        WebElement element = super.getByVisibility(userEmailLocator);
        element.sendKeys(email);
        return this;
    }


    private SignInPage enterEmailforRegistration(String email){
        WebElement element = super.getByVisibility(emailRegisterLocator);
        element.sendKeys(email);
        return this;
    }

    private SignInPage enterPassword(String password){
        WebElement element = super.getByVisibility(userPasswordLocator);
        element.sendKeys(password);
        return this;
    }
    private SignInPage enterUserDetails(String email, String password){
        enterEmail(email);
        enterPassword(password);
        return this;
    }

    public DetailPage clickRegisterButton(){
        super.click(registerButtonLocator);
        return new DetailPage(driver);
    }
    private MyAccountPage clickLoginButton(){
        super.click(loginButtonLocator);
        return new MyAccountPage(driver);
    }

    public MyAccountPage login(String email, String password){
        return enterUserDetails(email, password).
                clickLoginButton();
    }

    public DetailPage register(String email){
        return  enterEmailforRegistration(email).
                clickRegisterButton();
    }
}
