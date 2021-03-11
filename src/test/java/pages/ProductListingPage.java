package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class ProductListingPage extends PageObject {

    public ProductListingPage() {
        final String pageName = "Product listing page";
        addPageObject(pageName,"ADD_TO_CART", By.xpath("//div[@class='inventory_item']//button"));
    }
}