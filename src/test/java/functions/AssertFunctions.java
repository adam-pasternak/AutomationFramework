package functions;

import org.junit.Assert;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class AssertFunctions {

    public static void checkFieldDisplayFunction(String pageName, String fieldName, String condition) {
        boolean fieldIsDisplayed = WebDriverProvider.getWebDriver().findElements(getPageObjectLocator(pageName, fieldName)).size() >= 1;
        if (condition.equals("is"))
            Assert.assertTrue("Field " + fieldName + " isn't displayed, but it should.", fieldIsDisplayed);
        else if (condition.equals("is not"))
            Assert.assertFalse("Field " + fieldName + " is displayed, but it shouldn't.", fieldIsDisplayed);
    }

    public static void checkFieldContainsTextFunction(String pageName, String fieldName, String condition, String expectedValue) {
        boolean fieldContainsText = WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).getText().contains(expectedValue);
        if (condition.equals("contains"))
            Assert.assertTrue("Field " + fieldName + " doesn't contains value " + expectedValue + ", but it should.", fieldContainsText);
        else if (condition.equals("does not contains"))
            Assert.assertFalse("Field " + fieldName + " contains value " + expectedValue + ", but it shouldn't.", fieldContainsText);
    }

    public static void checkFieldEqualsTextFunction(String pageName, String fieldName, String condition, String expectedValue) {
        String actualValue = WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).getText();
        if (condition.equals("equals"))
            Assert.assertEquals("Field " + fieldName + " doesn't equals value " + expectedValue + ", but it should.", expectedValue, actualValue);
        else if (condition.equals("does not equals"))
            Assert.assertNotEquals("Field " + fieldName + " equals value " + expectedValue + ", but it shouldn't.", expectedValue, actualValue);
    }


}