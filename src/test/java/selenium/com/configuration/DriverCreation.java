package selenium.com.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import selenium.com.constants.BrowserType;


public class DriverCreation {
    public WebDriver selectDriver(String browserName){
        switch (BrowserType.valueOf(browserName.toUpperCase())){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            case OPERA:
                WebDriverManager.operadriver().setup();
                return new OperaDriver();

            default:
                throw new IllegalCallerException("Invalid Browser Name: "+ browserName);
        }

    }
}
