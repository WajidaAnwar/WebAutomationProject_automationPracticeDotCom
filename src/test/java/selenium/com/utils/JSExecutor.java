package selenium.com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutor {
    public static void scrollView(WebDriver driver, WebElement element){
        ((JavascriptExecutor) driver).
                executeScript(
                        "arguments[0].scrollIntoView(true)", element);
    }
}
