package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class LoginPage extends PageObject{

    public LoginPage() {
        addPageObject("USERNAME", By.id("user-name"));
        addPageObject("PASSWORD", By.id("password"));
    }
}
