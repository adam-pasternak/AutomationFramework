package steps;

import io.cucumber.java.en.Given;

import static functions.CompareFunctions.fieldEqualsValueFunction;
import static functions.CompareFunctions.fieldIsDisplayedFunction;


public class CompareSteps {

    @Given("^(.+): field ([^ ]+) is displayed")
    public void fieldIsDisplayed(String screenName, String fieldName) {
        fieldIsDisplayedFunction(screenName, fieldName);
    }

    @Given("^(.+): field ([^ ]+) equals value ([^ ]+)")
    public void fieldEqualsValue(String screenName, String fieldName, String value) {
        fieldEqualsValueFunction(screenName, fieldName, value);
    }
}