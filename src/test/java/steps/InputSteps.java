package steps;

import io.cucumber.java.en.Given;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class InputSteps {

    @Given("^(.+): fill field ([^ ]+) with keyword ([^ ]+)$")
    public void fillField(String pageName, String fieldName, String value) {
        WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).sendKeys(value);
    }
}