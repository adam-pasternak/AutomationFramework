package utils;

import org.openqa.selenium.By;
import pages.LoggedUserPanel;
import pages.LoginPage;

import java.util.HashMap;
import java.util.Map;

public class PageObject {

    /**
     *  fullPageObjectsMap contains PAGE_NAME, PAGE_OBJECT, LOCATOR
     *  pageObjectsMap contains PAGE_OBJECT, LOCATOR
     */
    static Map<String, Map<String, By>> fullPageObjectsMap = new HashMap<>();
    static HashMap<String, By> pageObjectsMap = new HashMap<>();

    public void addPageObject(String pageName, String pageObjectName, By locator) {

        pageObjectsMap.put(pageObjectName, locator);
        fullPageObjectsMap.put(pageName, pageObjectsMap);
    }

    public static void initializePageObjects(){
        new LoginPage();
        new LoggedUserPanel();
        Log.logInfo("Page objects initialized");
    }

    public static By getPageObjectLocator(String pageName, String pageObjectName){
        return fullPageObjectsMap.get(pageName).get(pageObjectName);
    }
}

