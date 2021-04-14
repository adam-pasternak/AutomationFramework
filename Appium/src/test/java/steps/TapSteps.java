package steps;

import io.cucumber.java.en.Given;
import utils.Log;

import static functions.TapFunctions.tapButtonFunction;
import static utils.AndroidDriverProvider.createAndroidDriver;


public class TapSteps {

    @Given("^(.+): tap ([^ ]+) button$")
    public void tapButton(String screenName, String fieldName) {
        tapButtonFunction(screenName, fieldName);
    }

}