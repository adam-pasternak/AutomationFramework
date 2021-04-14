package functions;


import utils.AndroidDriverProvider;

import static utils.PageObject.getPageObjectLocator;

public class TapFunctions {

    public static void tapButtonFunction(String screenName, String fieldName) {
        AndroidDriverProvider.getAndroidDriver().findElement(getPageObjectLocator(screenName, fieldName)).click();
    }
}
