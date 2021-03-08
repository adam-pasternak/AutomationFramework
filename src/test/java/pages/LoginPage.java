package pages;

import org.openqa.selenium.By;
import utils.PageObject;

public class LoginPage extends PageObject{

    public LoginPage() {
        addPageObject("LOGIN PAGE","USERNAME", By.id("user-name"));
        addPageObject("LOGIN PAGE","PASSWORD", By.id("password"));
    }
}