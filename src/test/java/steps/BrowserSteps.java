package steps;

import io.cucumber.java.en.Given;

import static functions.BrowserFunctions.openURLFunction;

public class BrowserSteps {

    @Given("^Open URL: ([^ ]+)$")
    public void openURL(String URL) {
        openURLFunction(URL);
    }
}