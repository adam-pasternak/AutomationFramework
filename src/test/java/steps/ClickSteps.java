package steps;

import io.cucumber.java.en.Given;

import static functions.ClickFunctions.clickFieldFunction;

public class ClickSteps {

    @Given("^(.+): click on field ([^ ]+)$")
    public void clickField(String pageName, String fieldName) {
        clickFieldFunction(pageName, fieldName);
    }
}