package selenium.com.pageObjects;

import selenium.com.utils.JacksonUtils;

import java.io.IOException;

public class UserDetails {

    private String state;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String company;
    private String address;
    private String city;
    private String zip;
    private String country;
    private String mobile;
    private String reference;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return this.state;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getMobile() {
        return mobile;
    }

    public String getReference() {
        return reference;
    }



    public UserDetails() {
    }

    public UserDetails(String fileName) throws IOException {

        UserDetails userDetails = JacksonUtils.deserializeJson(
                fileName, UserDetails.class);

        this.firstName = userDetails.getFirstName();
        this.lastName = userDetails.getLastName();
        this.email = userDetails.getEmail();
        this.password = userDetails.getPassword();
        this.company = userDetails.getCompany();
        this.address = userDetails.getAddress();
        this.state = userDetails.getState();
        this.city = userDetails.getCity();
        this.zip = userDetails.getZip();
        this.country = userDetails.getCountry();
        this.mobile = userDetails.getMobile();
        this.reference = userDetails.getReference();
    }


}
