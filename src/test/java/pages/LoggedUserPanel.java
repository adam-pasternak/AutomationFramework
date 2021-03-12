package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class LoggedUserPanel extends PageObject {

    public LoggedUserPanel() {
        final String pageName = "Logged user panel";
        addPageObject(pageName,"AMOUNT_OF_PRODUCTS_IN_CART", By.xpath("//span[contains(@class,'shopping_cart_badge')]"));
        addPageObject(pageName,"CART", By.xpath("//div[@id='shopping_cart_container']/a"));
        addPageObject(pageName,"LOGOUT", By.id("logout_sidebar_link"));
        addPageObject(pageName,"MENU", By.id("react-burger-menu-btn"));
    }
}