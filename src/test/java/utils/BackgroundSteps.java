package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.WebDriverProvider.createWebDriver;


public class BackgroundSteps {

    @Before
    public void before(Scenario scenario) {
        System.out.println("Creating driver");
        createWebDriver("chrome");
    }

    @After
    public void after(Scenario scenario) {
        WebDriverProvider.getWebDriver().quit();
    }
}
