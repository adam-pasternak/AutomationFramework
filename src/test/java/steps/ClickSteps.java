package steps;

import io.cucumber.java.en.Given;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class ClickSteps {

    @Given("^(.+): click on field ([^ ]+)$")
    public void clickField(String pageName, String fieldName) {
        WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).click();
    }
}