package selenium.com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.com.configuration.DriverManager;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setDriver(){
        driver = new DriverManager().initializeDriver();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
