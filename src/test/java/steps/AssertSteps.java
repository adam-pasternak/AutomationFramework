package steps;

import io.cucumber.java.en.Given;

import static functions.AssertFunctions.*;

public class AssertSteps {

    @Given("^(.+): field ([^ ]+) (is|is not) displayed")
    public void checkFieldDisplay(String pageName, String fieldName, String condition) {
        checkFieldDisplayFunction(pageName, fieldName, condition);
    }

    @Given("^(.+): field ([^ ]+) (contains|does not contains) value (.+)")
    public void checkFieldContainsText(String pageName, String fieldName, String condition, String value) {
        checkFieldContainsTextFunction(pageName, fieldName, condition, value);
    }

    @Given("^(.+): field ([^ ]+) (equals|does not equals) value (.+)")
    public void checkFieldEqualsText(String pageName, String fieldName, String condition, String value) {
        checkFieldEqualsTextFunction(pageName, fieldName, condition, value);
    }

    @Given("^(.+): product ([^ ]+) exists in ([^ ]+)")
    public void productExistsInCart(String pageName, String productName, String fieldName) {
        productExistsInCartFunction(pageName, productName, fieldName);
    }
}