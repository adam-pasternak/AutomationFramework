package steps;

import io.cucumber.java.en.Given;
import utils.Log;

import static utils.AppiumDriverProvider.createAndroidDriver;


public class AppSteps {

    @Given("^Device: Open application on device ([^ ]+)$")
    public void openAppOnDevice(String deviceName) {
        createAndroidDriver(deviceName);
        Log.logInfo("App opened");
    }

}