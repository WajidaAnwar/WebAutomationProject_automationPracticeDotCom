package selenium.com.tests;


import org.testng.annotations.Test;
import selenium.com.pageObjects.AuthenticationDetails;
import selenium.com.pageObjects.UserDetails;
import selenium.com.pages.*;

import java.io.IOException;




public class TestCase extends CommonMethods {

    private String email;


    @Test
    public void createUser_01() throws IOException {
        createUser("UserDetails1.json");
    }


    @Test
    public void createUser_02() throws IOException {
        createUser("UserDetails2.json");
    }


    @Test
    public void shopping() throws  IOException {
        super.shopping("JSONWrite.json");
    }
}










//
////      execute the search operation by taking the keyword
//        storePage.search("Blue");
//
////      validating the page title
//        storePage.validateTitle("Search results: “Blue”" );
//
//
////      This variable contains the json file regarding product details
//        String productFileName = "products.json";
//
////      fetching product data according to product id
////      using dynamic locators
//        Product item = new Product(1215, productFileName);
//
////      click to add cart button for specific type of product
//
//        storePage.clickAddToCartButton(item.getName());
//
//
//
////      view cart items what we have added
////      this line will navigate to cart page
////      and returns an object for cartPage
//        CartPage cartPage = storePage.clickViewCartLink();
//
//
////      validating the product name is okay or not
//        cartPage.validateProduct(item.getName());
//
//
////      this line navigates to Billing Page
////      click on proceed to check out
//        CheckOutPage checkOutPage = cartPage.clickCheckOutButton();
//
////      User class contains the data about user
//        User user = new User();
////      this method helps the user to log in the system
//        checkOutPage.logIn(user.getEmail(), user.getPassword());
//
////       these methods provide all the necessary information
////       regarding billing user and process the steps
////       for place order successfully
//        checkOutPage.placeOrder(billingAddress);
//
//
//
////      validates whether the products are successfully purchased or not
////      using confirmation text
//        checkOutPage.confirmation("Thank you. Your order has been received.");


