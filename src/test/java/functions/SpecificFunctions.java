package functions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestData;
import utils.WebDriverProvider;

import static utils.PageObject.getPageObjectLocator;
import static utils.TestData.set;
import static utils.Tools.getRandomElement;

public class SpecificFunctions {

    public static void addRandomProductToCartFunction(String pageName){
        WebElement randomElement = getRandomElement(WebDriverProvider.getWebDriver().findElements(getPageObjectLocator(pageName, "ADD_TO_CART")));
        String productName = randomElement.findElement(By.xpath("./ancestor::div[@class='inventory_item']//div[@class='inventory_item_name']")).getText();
        set("RANDOMLY_ADDED_TO_CART_PRODUCT", productName);
        randomElement.click();
    }

    public static void buttonOfRandomlySelectedProductHasValueFunction(String pageName, String value){
        WebElement buttonText = WebDriverProvider.getWebDriver().findElement(By.xpath("//div[@class='inventory_item_name'][text()='" + TestData.get("RANDOMLY_ADDED_TO_CART_PRODUCT") + "']//ancestor::div[@class='inventory_item']//button"));
        Assert.assertTrue(buttonText.getText().equals(value));
    }
}
