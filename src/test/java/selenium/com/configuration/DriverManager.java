package selenium.com.configuration;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    public WebDriver initializeDriver() {
        String browser = System.getProperty("browser","chrome");
        WebDriver driver = new selenium.com.configuration.DriverCreation().selectDriver(browser);
        driver.manage().window().maximize();
        return driver;
    }
}
