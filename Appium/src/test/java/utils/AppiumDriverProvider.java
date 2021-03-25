package utils;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverProvider {

    static AndroidDriver driver;
    final static long IMPLICIT_WAIT = 3;

    public static AndroidDriver createAndroidDriver() throws Exception {

        File app= new File("src\\test\\resources\\apps\\ColorNote.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("udid","277d9d14ca1c7ece");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("app-package", "com.socialnmobile.dictapps.notepad.color.note");
        capabilities.setCapability("app-activity", "com.socialnmobile.colornote.activity.Main");
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

        return driver;
    }

    public static AndroidDriver getAndroidDriver(){
        return driver;
    }
}
