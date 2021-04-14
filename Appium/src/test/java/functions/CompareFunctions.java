package functions;


import utils.AndroidDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class CompareFunctions {

    public static void fieldIsDisplayedFunction(String screenName, String fieldName) {
        AndroidDriverProvider.getAndroidDriver().findElement(getPageObjectLocator(screenName, fieldName)).isDisplayed();
    }
}
