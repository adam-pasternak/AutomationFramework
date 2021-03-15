package functions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;
import utils.WebDriverProvider;

import java.io.IOException;

import static utils.Tools.getProperty;

public class BrowserFunctions {

    public static void openURLFunction(String URL){
        try {
            WebDriverProvider.getWebDriver()
                .get(URL.contains("http") ? URL : getProperty("src\\test\\resources\\config.properties", URL));
        } catch (IOException e) {
            Log.logError("There was a problem with opening provided URL");
            e.printStackTrace();
        }
    }

    public static void checkPageURLFunction(String URL) {
        Assert.assertTrue("Page doesn't contains URL: " + URL + ". Current URL value: " +  WebDriverProvider.getWebDriver().getCurrentUrl(),
                WebDriverProvider.getWebDriver().getCurrentUrl().equals(URL));
    }

    public static void switchToOpenedTabFunction(String pageTitle) {
        for(String winHandle : WebDriverProvider.getWebDriver().getWindowHandles()){
            if (WebDriverProvider.getWebDriver().switchTo().window(winHandle).getTitle().equals(pageTitle)) {
                break;
            }
        }
    }

    public static void waitForFullPageLoadFunction() {

        WebDriverWait waitForFullPageLoad = new WebDriverWait(WebDriverProvider.getWebDriver(), 10);
        waitForFullPageLoad.until(new ExpectedCondition<Boolean>() {

            @Override
            public Boolean apply(WebDriver driver) {

                JavascriptExecutor js = (JavascriptExecutor) WebDriverProvider.getWebDriver();
                String readyState = js.executeScript("return document.readyState").toString();
                Log.logInfo("Page loading state: " + readyState);

                return readyState.equals("complete");
            }
        });
    }
}
