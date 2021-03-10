package steps;

import io.cucumber.java.en.Given;

import static functions.InputFunctions.fillFieldFunction;

public class InputSteps {

    @Given("^(.+): fill field ([^ ]+) with keyword ([^ ]+)$")
    public void fillField(String pageName, String fieldName, String value) {
        fillFieldFunction(pageName, fieldName, value);
    }
}