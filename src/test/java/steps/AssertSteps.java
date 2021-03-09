package steps;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class AssertSteps {

    @Given("^(.+): field ([^ ]+) is displayed")
    public void fillField(String pageName, String fieldName) {
        Assert.assertTrue(WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).isDisplayed());
    }
}