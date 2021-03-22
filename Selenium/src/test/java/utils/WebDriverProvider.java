package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverProvider {

    static WebDriver driver;
    final static long IMPLICIT_WAIT = 3;

    public static WebDriver createWebDriver(String browser) throws Exception {

        try {

            if (browser.equals("CHROME")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equals("FIREFOX")) {
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equals("EDGE")) {
                System.setProperty("webdriver.edge.driver", "src\\test\\resources\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        } catch (Exception e){
            Log.logError("Browser information was not provided. Test won't be executed.");
            throw new Exception(e);
        }

        return driver;
    }

    public static WebDriver getWebDriver(){
        return driver;
    }
}
