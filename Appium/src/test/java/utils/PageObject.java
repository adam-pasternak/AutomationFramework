package utils;

import org.openqa.selenium.By;

import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class PageObject {

    /**
     *  fullPageObjectsMap contains PAGE_NAME, PAGE_OBJECT, LOCATOR
     *  pageObjectsMap contains PAGE_OBJECT, LOCATOR
     */
    static Map<String, Map<String, By>> fullPageObjectsMap = new HashMap<>();
    static HashMap<String, By> pageObjectsMap = new HashMap<>();
    static String pagesLocation = "screens";

    public static void initializePageClasses() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            File packageDir = new File(classLoader.getResource(pagesLocation).toURI());

            for (String pageClassName : packageDir.list()) {
                String className = String.format("%s.%s", pagesLocation, pageClassName.replace(".class", ""));
                classLoader.loadClass(className).newInstance();
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | URISyntaxException e) {
            Log.logError("Encountered problem with page classes initialization");
            e.printStackTrace();
        }
        Log.logInfo("Screen classes initialized");
    }

    public void addPageObject(String pageName, String pageObjectName, By locator) {
        pageObjectsMap.put(pageObjectName, locator);
        fullPageObjectsMap.put(pageName, pageObjectsMap);
    }

    public static By getPageObjectLocator(String pageName, String pageObjectName){
        return fullPageObjectsMap.get(pageName).get(pageObjectName);
    }
}

