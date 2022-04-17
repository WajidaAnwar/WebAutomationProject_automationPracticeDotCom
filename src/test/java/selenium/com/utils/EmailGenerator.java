package selenium.com.utils;

import com.mifmif.common.regex.Generex;

public class EmailGenerator {
    private static String regex = "asha\\w{10}\\@gmail\\.com";

    public static String myMail(){
        return new Generex(regex).random();
    }

}
