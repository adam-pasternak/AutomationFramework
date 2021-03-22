package functions;

import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class InputFunctions {

    public static void fillFieldFunction(String pageName, String fieldName, String value){
        WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).sendKeys(value);
    }
}
