package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utils.PageObject.initializePageClasses;


public class BackgroundSteps {

    @Before
    public void before(Scenario scenario) throws Exception {
        initializePageClasses();
    }

    @After
    public void after(Scenario scenario) {
        AndroidDriverProvider.getAndroidDriver().quit();
        Log.logInfo("App closed");
    }
}
