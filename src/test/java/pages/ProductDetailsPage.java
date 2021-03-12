package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class ProductDetailsPage extends PageObject {

    public ProductDetailsPage() {
        final String pageName = "Product listing page";
        addPageObject(pageName,"ADD_TO_CART_BUTTON", By.xpath("//button[contains(@class,'btn_inventory')]"));
        addPageObject(pageName,"REMOVE", By.xpath("//button[text()='REMOVE']"));
    }
}