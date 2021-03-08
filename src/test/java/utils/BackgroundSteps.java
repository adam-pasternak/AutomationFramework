package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.WebDriverProvider.createWebDriver;


public class BackgroundSteps {

    @Before
    public void before(Scenario scenario) throws Exception {
        createWebDriver("chrome");
        Log.logInfo("Browser opened");
    }

    @After
    public void after(Scenario scenario) {
        WebDriverProvider.getWebDriver().quit();
        Log.logInfo("Browser closed");
    }
}
