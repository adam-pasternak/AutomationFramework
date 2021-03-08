package steps;

import io.cucumber.java.en.Given;
import utils.WebDriverProvider;

import static utils.Tools.getProperty;

public class BrowserSteps {

    @Given("^Open URL: ([^ ]+)$")
    public void openURL(String URL) throws Throwable {
        WebDriverProvider.getWebDriver()
                .get(URL.contains("http") ? URL : getProperty("src\\test\\resources\\config.properties", URL));
    }
}