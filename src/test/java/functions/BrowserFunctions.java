package functions;

import utils.Log;
import utils.WebDriverProvider;

import java.io.IOException;

import static utils.Tools.getProperty;

public class BrowserFunctions {

    public static void openURLFunction(String URL){
        try {
            WebDriverProvider.getWebDriver()
                .get(URL.contains("http") ? URL : getProperty("src\\test\\resources\\config.properties", URL));
        } catch (IOException e) {
            Log.logError("There was a problem with opening provided URL");
            e.printStackTrace();
        }
    }
}
