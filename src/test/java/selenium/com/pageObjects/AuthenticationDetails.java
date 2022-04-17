package selenium.com.pageObjects;

import selenium.com.utils.JacksonUtils;

import java.io.IOException;

public class AuthenticationDetails {
    private String email;
    private String password;
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public AuthenticationDetails(){

    }


    public AuthenticationDetails(String fileName) throws IOException {

        AuthenticationDetails authenticationDetails = JacksonUtils.deserializeJson(
                fileName, AuthenticationDetails.class);

        this.email = authenticationDetails.getEmail();
        this.password = authenticationDetails.getPassword();
    }
}
