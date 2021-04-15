package steps;

import io.cucumber.java.en.Given;

import static functions.InputFunctions.fillFieldWithValueFunction;


public class InputSteps {

    @Given("^(.+): fill field ([^ ]+) with value ([^ ]+)")
    public void fillFieldWithValue(String screenName, String fieldName, String value) {
        fillFieldWithValueFunction(screenName, fieldName, value);
    }

}