package steps;

import io.cucumber.java.en.Given;

import static functions.CompareFunctions.fieldIsDisplayedFunction;


public class CompareSteps {

    @Given("^(.+): field ([^ ]+) is displayed")
    public void fieldIsDisplayed(String screenName, String fieldName) {
        fieldIsDisplayedFunction(screenName, fieldName);
    }

}