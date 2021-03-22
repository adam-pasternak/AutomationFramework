package steps;

import io.cucumber.java.en.Given;

import static functions.BrowserFunctions.*;

public class BrowserSteps {

    @Given("^Browser: Open URL ([^ ]+)$")
    public void openURL(String URL) {
        openURLFunction(URL);
    }

    @Given("^Browser: Current page URL is ([^ ]+)$")
    public void checkPageURL(String URL) {
        checkPageURLFunction(URL);
    }

    @Given("^Browser: switch to tab with title (.+)$")
    public void switchToTabByTitle(String pageTitle) {
        switchToOpenedTabFunction(pageTitle);
    }

    @Given("^Browser: wait for full page load$")
    public void waitForFullPageLoad() {
        waitForFullPageLoadFunction();
    }
}