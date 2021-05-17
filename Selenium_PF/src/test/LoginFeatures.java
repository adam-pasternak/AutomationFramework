package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoggedUserPanel;
import pages.LoginPage;
import utils.WebDriverProvider;

import static utils.Tools.getProperty;


public class LoginFeatures {

    WebDriver driver;
    LoginPage objLogin;
    LoggedUserPanel objLoggedUserPanel;

    @BeforeMethod
    public void setup() throws Exception {
        driver = WebDriverProvider.createWebDriver(getProperty("resources\\config.properties", "BROWSER"));
        driver.get(getProperty("resources\\config.properties", "SAUCEDEMO"));
    }

    @Test(description = "Positive login test", priority = 1)
    public void testPositiveLogin() {

        // Fill login form with correct credentials and click SUBMIT
        objLogin = new LoginPage(driver);
        objLogin.setUsername("standard_user");
        objLogin.setPassword("secret_sauce");
        objLogin.clickSubmit();

        // Assert that user has logged in correctly - cart icon is visible
        objLoggedUserPanel = new LoggedUserPanel(driver);
        Assert.assertTrue(objLoggedUserPanel.cartIsDisplayed());
    }

    @Test(description = "Negative login test", priority = 2)
    public void testNegativeLogin() {

        // Fill login form with correct credentials and click SUBMIT
        objLogin = new LoginPage(driver);
        objLogin.setUsername("standard_user");
        objLogin.setPassword("wrong_password");
        objLogin.clickSubmit();

        // Assert that user has logged in correctly - cart icon is not visible amd error message is displayed
        objLoggedUserPanel = new LoggedUserPanel(driver);
        Assert.assertEquals(objLogin.getErrorMessageText(), "Epic sadface: Username and password do not match any user in this service");
        Assert.assertFalse(objLoggedUserPanel.cartIsDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
