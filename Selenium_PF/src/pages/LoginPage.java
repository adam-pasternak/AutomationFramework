package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement submit;

    @FindBy(id = "user-name")
    WebElement username;

    //=================================================================//

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //=================================================================//

    public void setUsername(String strUserName){
        username.sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickSubmit(){
        submit.click();
    }

    public String getErrorMessageText(){
        return errorMessage.getText();
    }
}
