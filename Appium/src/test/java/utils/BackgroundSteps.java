package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.PageObject.initializePageClasses;
import static utils.AppiumDriverProvider.createAndroidDriver;


public class BackgroundSteps {

    @Before
    public void before(Scenario scenario) throws Exception {
        initializePageClasses();
        createAndroidDriver();
        Log.logInfo("App opened");
    }

    @After
    public void after(Scenario scenario) {
        AppiumDriverProvider.getAndroidDriver().quit();
        Log.logInfo("App closed");
    }
}
