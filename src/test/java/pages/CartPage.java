package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class CartPage extends PageObject {

    public CartPage() {
        final String pageName = "Cart page";
        addPageObject(pageName,"CART_PRODUCTS_LIST", By.xpath("//div[@class='inventory_item_name']"));
        addPageObject(pageName,"CONTINUE_SHOPPING", By.xpath("//a[text()='Continue Shopping']"));
        addPageObject(pageName,"REMOVE", By.xpath("//button[text()='REMOVE']"));
    }
}