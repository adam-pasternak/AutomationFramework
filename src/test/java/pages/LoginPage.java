package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class LoginPage extends PageObject {

    public LoginPage() {
        final String pageName = "Login page";
        addPageObject(pageName,"ERROR_MESSAGE", By.xpath("//h3[@data-test='error']"));
        addPageObject(pageName,"PASSWORD", By.id("password"));
        addPageObject(pageName,"SUBMIT", By.id("login-button"));
        addPageObject(pageName,"USERNAME", By.id("user-name"));
    }
}