package selenium.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.com.base.BasePage;
import selenium.com.pageObjects.UserDetails;
import selenium.com.utils.JSExecutor;

public class DetailPage extends BasePage {

    private final By firstNameLocator = By.id("customer_firstname");
    private final By lastNameLocator = By.id("customer_lastname");
    private final By passwordLocator = By.id("passwd");
    private final By companyLocator = By.id("company");
    private final By CountryDropdownLocator = By.id("uniform-id_country");
    private final By AddressLocator = By.id("address1");
    private final By CityLocator = By.id("city");
    private final By StateDropdownLocator = By.id("uniform-id_state");
    private final By ZipLocator = By.id("postcode");
    private final By mobileLocator = By.id("phone_mobile");
    private final By refLocator = By.id("alias");
    private final By registerButtonLocator = By.id("submitAccount");

    public DetailPage(WebDriver driver) {
        super(driver);
    }

    //  enter the user first name
    private DetailPage enterFirstName(String firstName) {
        WebElement element = super.getByVisibility(firstNameLocator);
        element.clear();
        element.sendKeys(firstName);
        return this;
    }


    //    enter the user last name
    private DetailPage enterLastName(String lastName) {
        WebElement element = super.getByVisibility(lastNameLocator);
        element.clear();
        element.sendKeys(lastName);
        return this;
    }

    private DetailPage enterPassword(String password) {
        WebElement element = super.getByVisibility(passwordLocator);
        element.clear();
        element.sendKeys(password);
        return this;
    }

    private DetailPage enterCompany(String company) {
        WebElement element = super.getByVisibility(companyLocator);
        element.clear();
        element.sendKeys(company);
        return this;
    }



    private DetailPage setCountry(String country){
        super.click(CountryDropdownLocator);
        WebElement element = isClickable(getLocator(country));
        JSExecutor.scrollView(driver,element);
        element.click();
        return this;
    }


    //    enter the billing address of user
    private DetailPage enterAddress(String address) {
        WebElement element = super.getByVisibility(AddressLocator);
        element.clear();
        element.sendKeys(address);
        return this;
    }



    //    enter the billing city of user
    private DetailPage enterCity(String cityName) {
        WebElement element = super.getByVisibility(CityLocator);
        element.clear();
        element.sendKeys(cityName);
        return this;
    }


    private DetailPage setState(String state){

        super.click(StateDropdownLocator);
        WebElement element = isClickable(getLocator(state));
        JSExecutor.scrollView(driver,element);
        element.click();
        return this;
    }


    //    enter the billing zip of the user
    private DetailPage enterZip(String zipCode) {
        WebElement element = super.getByVisibility(ZipLocator);
        element.clear();
        element.sendKeys(zipCode);
        return this;
    }



    //    enter the user email for billing
    private DetailPage enterMobile(String mobile) {
        WebElement element = super.getByVisibility(mobileLocator);
        element.clear();
        element.sendKeys(mobile);
        return this;
    }

    private DetailPage enterReference(String ref) {
        WebElement element = super.getByVisibility(refLocator);
        element.clear();
        element.sendKeys(ref);
        return this;
    }



    //    this method helps to click on place order button to process further
    private void clickRegisterButton() {
        super.click(registerButtonLocator);
    }


    //  This is the method which compresses all the key methods
//  for this page to place order
    public void register(UserDetails userDetails){
        enterFirstName(userDetails.getFirstName()).
                enterLastName(userDetails.getLastName()).
                enterPassword(userDetails.getPassword()).
                enterCompany(userDetails.getCompany()).
                enterAddress(userDetails.getAddress()).
                enterCity(userDetails.getCity()).
                setState(userDetails.getState()).
                enterZip(userDetails.getZip()).
                setCountry(userDetails.getCountry()).
                enterMobile(userDetails.getMobile()).
                enterReference(userDetails.getReference()).
                clickRegisterButton();

    }

}
