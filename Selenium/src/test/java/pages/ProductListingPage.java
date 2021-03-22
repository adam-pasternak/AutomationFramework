package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class ProductListingPage extends PageObject {

    public ProductListingPage() {
        final String pageName = "Product listing page";
        addPageObject(pageName,"ADD_TO_CART", By.xpath("//div[@class='inventory_item']//button"));
        addPageObject(pageName,"PREVIOUSLY_ADDED_TO_CART_PRODUCT_NAME", By.xpath("//button[text()='REMOVE']//ancestor::div[@class='inventory_item']//div[@class='inventory_item_name']"));
        addPageObject(pageName,"PRODUCT_NAME", By.xpath("//div[@class='inventory_item_name']"));
        addPageObject(pageName,"REMOVE", By.xpath("//button[text()='REMOVE']"));
    }
}