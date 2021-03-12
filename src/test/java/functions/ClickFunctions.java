package functions;

import org.openqa.selenium.WebElement;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;
import static utils.TestData.set;
import static utils.Tools.getRandomElement;

public class ClickFunctions {

    public static void clickFieldFunction(String pageName, String fieldName){
        WebDriverProvider.getWebDriver().findElement(getPageObjectLocator(pageName, fieldName)).click();
    }

    public static void clickRandomFieldFunction(String pageName, String fieldName, String saveAs){
        WebElement randomElement = getRandomElement(WebDriverProvider.getWebDriver().findElements(getPageObjectLocator(pageName, fieldName)));
        set(saveAs, randomElement.getText());
        randomElement.click();
    }
}
