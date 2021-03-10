package steps;

import io.cucumber.java.en.Given;

import static functions.AssertFunctions.checkFieldDisplayFunction;

public class AssertSteps {

    @Given("^(.+): field ([^ ]+) (is|is not) displayed")
    public void checkFieldDisplay(String pageName, String fieldName, String condition) {
        checkFieldDisplayFunction(pageName, fieldName, condition);
    }
}