package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utils.Tools.getProperty;

public class AndroidDriverProvider {

    static AndroidDriver driver;
    final static long IMPLICIT_WAIT = 3;

    public static AndroidDriver createAndroidDriver(String deviceName) {

        try {
        String appConfigFileLocation = "src\\test\\resources\\app_capabilities.properties";
        String deviceConfigFileLocation = "src\\test\\resources\\device_mapper.properties";
        File app = new File("src\\test\\resources\\apps\\" + getProperty(appConfigFileLocation, "app-name") + ".apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", getProperty(deviceConfigFileLocation, deviceName));
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("app-package", getProperty(appConfigFileLocation, "app-package"));
        capabilities.setCapability("app-activity", getProperty(appConfigFileLocation, "app-activity"));
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
            Log.logInfo("There was a problem with creating AndroidDriver instance");
        }
        return driver;
    }

    public static AndroidDriver getAndroidDriver(){
        return driver;
    }
}
