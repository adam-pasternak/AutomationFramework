package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverProvider {

    private static WebDriver driver;
    final static long IMPLICIT_WAIT = 3;

    public static WebDriver createWebDriver(String browser) throws Exception {

        try {

            if (browser.equals("CHROME")) {
                System.setProperty("webdriver.chrome.driver", "resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equals("FIREFOX")) {
                System.setProperty("webdriver.gecko.driver", "resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equals("EDGE")) {
                System.setProperty("webdriver.edge.driver", "resources\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();

            } else if (browser.equals("CHROME DOCKER")) {
                driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), new ChromeOptions());

            } else if (browser.equals("FIREFOX DOCKER")) {
                driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), new FirefoxOptions());
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        } catch (Exception e){
            Log.logError("Browser information was not provided. Test won't be executed.");
            throw new Exception(e);
        }

        return driver;
    }

}
