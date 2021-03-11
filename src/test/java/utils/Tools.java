package utils;

import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class Tools {

    public static String getProperty(String fileName, String propertyName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop.getProperty(propertyName);
    }

    public static WebElement getRandomElement(List<WebElement> elements) {
        Random random = new Random();
        int element = random.nextInt(elements.size());
        return elements.get(element);
    }

}
