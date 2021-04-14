package screens;

import io.appium.java_client.MobileBy;
import utils.PageObject;

public class WelcomeScreen extends PageObject {

    public WelcomeScreen() {
        final String pageName = "Welcome screen";
        addPageObject(pageName,"ADD_NOTE", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/empty_text"));

    }
}