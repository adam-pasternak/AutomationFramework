package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPanel {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(@class,'shopping_cart_badge')]")
    WebElement amountOfProductsInCart;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
    WebElement cart;

    @FindBy(id = "logout_sidebar_link")
    WebElement logout;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;

    //=================================================================//

    public LoggedUserPanel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //=================================================================//

    public Boolean cartIsDisplayed() {
        boolean cartIsDisplayed = false;
        try {
            cartIsDisplayed = cart.isDisplayed();
        } catch (NoSuchElementException e) {}
        return cartIsDisplayed;
    }
}
