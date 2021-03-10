package functions;

import org.junit.Assert;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class AssertFunctions {

    public static void checkFieldDisplayFunction(String pageName, String fieldName, String condition) {
        if (condition.equals("is"))
            Assert.assertTrue("Field " + fieldName + " isn't displayed, but it should.",
                    WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).isDisplayed());
        else if (condition.equals("is not"))
            Assert.assertTrue("Field " + fieldName + " is displayed, but shouldn't.",
                    !WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).isDisplayed());
    }
}