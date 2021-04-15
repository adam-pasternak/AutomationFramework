package functions;


import utils.AndroidDriverProvider;
import utils.Log;

import static utils.PageObject.getPageObjectLocator;

public class InputFunctions {

    public static void fillFieldWithValueFunction(String screenName, String fieldName, String value) {
        AndroidDriverProvider.getAndroidDriver().findElement(getPageObjectLocator(screenName, fieldName)).sendKeys(value);
    }
}
