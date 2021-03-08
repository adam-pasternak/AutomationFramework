package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.PageObject.getPageObject;
import static utils.PageObject.initializePageObjects;
import static utils.Tools.getProperty;
import static utils.WebDriverProvider.createWebDriver;


public class BackgroundSteps {

    @Before
    public void before(Scenario scenario) throws Exception {
        initializePageObjects();
        String browser = getProperty("src\\test\\resources\\config.properties", "BROWSER");
        createWebDriver(browser);
        Log.logInfo("Browser " + browser + " opened");
    }

    @After
    public void after(Scenario scenario) {
        WebDriverProvider.getWebDriver().quit();
        Log.logInfo("Browser closed");
    }
}
