package steps;

import io.cucumber.java.en.Given;
import utils.PageObject;
import utils.WebDriverProvider;

import static utils.Tools.getProperty;

public class BrowserSteps extends PageObject {

    @Given("^Open URL: ([^ ]+)$")
    public void openURL(String URL) throws Throwable {
        WebDriverProvider.getWebDriver()
                .get(URL.contains("http") ? URL : getProperty("src\\test\\resources\\config.properties", URL));
    }
}