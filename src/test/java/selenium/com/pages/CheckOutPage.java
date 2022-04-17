package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.com.base.BasePage;

public class CheckOutPage extends BasePage {

    private final By proceed1 = By.cssSelector("a[class='button btn btn-default standard-checkout button-medium'] i[class='icon-chevron-right right']");
    private final By proceed2 = By.cssSelector("button[name='processAddress'] span");
    private final By proceed3 = By.id("cgv");
    private final By proceed4 = By.cssSelector("button[name='processCarrier'] span");
    private final By paymentByCheckLocator = By.cssSelector("a[title='Pay by check.']");
    private final By confirmationButtonLocator = By.xpath("//span[normalize-space()='I confirm my order']");
    private final By logOutButtonLocator = By.cssSelector("a[title='Log me out']");


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public void checkOut(){
        super.click(proceed1);
        super.click(proceed2);
        super.clickByPresence(proceed3);
        super.click(proceed4);
        super.click(paymentByCheckLocator);
        super.click(confirmationButtonLocator);
        super.click(logOutButtonLocator);
        return;
    }

}
