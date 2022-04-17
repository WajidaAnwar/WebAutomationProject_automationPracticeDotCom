package selenium.com.tests;

import selenium.com.base.BaseTest;
import selenium.com.pageObjects.AuthenticationDetails;
import selenium.com.pageObjects.UserDetails;
import selenium.com.pages.*;
import selenium.com.utils.EmailGenerator;
import selenium.com.utils.WriteDataToJson;

import java.io.IOException;

public class CommonMethods extends BaseTest {

    private int userCount = 0;



    private String password;
    protected void createUser(String addressFileName) throws IOException {
        HomePage homePage = new HomePage(driver).load();
        SignInPage signInPage = homePage.clickSignInLink();
        String userEmail = EmailGenerator.myMail();
        WriteDataToJson.write(userEmail);
        DetailPage detailPage = signInPage.register(userEmail);
        UserDetails userDetails = new UserDetails(addressFileName);
        detailPage.register(userDetails);

        this.userCount++;
        System.out.println("User -"+this.userCount+" has been created");

        return;
    }


    protected void shopping(String fileName) throws IOException {
        HomePage homePage = new HomePage(driver).load();
        SignInPage signInPage = homePage.clickSignInLink();
        AuthenticationDetails authenticationDetails = new AuthenticationDetails(fileName);
        MyAccountPage myAccountPage = signInPage.login(authenticationDetails.getEmail(), authenticationDetails.getPassword());
        CasualDressPage casualDressPage = myAccountPage.clickCasualDressLink();
        casualDressPage.addDress();
        TShirtPage tShirtPage = casualDressPage.clickTShirtLink();
        tShirtPage.addShirt();
        CheckOutPage checkOutPage = tShirtPage.navigateToCheckout();
        checkOutPage.checkOut();
    }




}
