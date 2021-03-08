package utils;

import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.HashMap;
import java.util.Map;

public class PageObject {

    static Map<String, By> pageObjects  = new HashMap<>();

    public void addPageObject(String pageObjectName, By locator) {
        pageObjects.put(pageObjectName, locator);
    }

    public static void initializePageObjects(){
        new LoginPage();
        Log.logInfo("Page objects initialized");
    }

    public static void getPageObject(String pageObjectName){
        pageObjects.get(pageObjectName);
    }

}

