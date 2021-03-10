package functions;

import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class ClickFunctions {

    public static void clickFieldFunction(String pageName, String fieldName){
        WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).click();
    }
}
