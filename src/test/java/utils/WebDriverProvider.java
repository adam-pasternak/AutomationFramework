package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {

    static WebDriver driver;

    public static WebDriver createWebDriver(String browser){

        try {

            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equals("firefox")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\firefox.exe");
                driver = new FirefoxDriver();

            } else if (browser.equals("edge")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\firefox.exe");
                driver = new EdgeDriver();
            }

            driver.manage().window().maximize();

        } catch (Exception e){
            // TODO: logging exception
        }

        return driver;
    }

    public static WebDriver getWebDriver(){
        return driver;
    }
}
