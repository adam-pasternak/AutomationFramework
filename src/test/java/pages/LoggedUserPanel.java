package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class LoggedUserPanel extends PageObject {

    public LoggedUserPanel() {
        final String pageName = "Logged user panel";
        addPageObject(pageName,"CART", By.xpath("//div[@id='shopping_cart_container']/a"));
    }
}