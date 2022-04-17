package selenium.com.utils;

import org.json.simple.JSONObject;
import selenium.com.pageObjects.UserDetails;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataToJson extends UserDetails {
    public static void write(String email) throws IOException {
        JSONObject jObj = new JSONObject();
        jObj.put("email", email);
        jObj.put("password", new UserDetails("UserDetails1.json").getPassword());

        FileWriter file = new FileWriter("src/test/resources/JSONWrite.json");
        file.write(jObj.toJSONString());
        file.close();
    }
}
