package screens;

import io.appium.java_client.MobileBy;
import utils.PageObject;

public class AddNote extends PageObject {

    public AddNote() {
        final String pageName = "Add note";
        addPageObject(pageName,"CHECKLIST_NOTE", MobileBy.xpath("//android.widget.LinearLayout[2]/android.widget.TextView"));
        addPageObject(pageName,"TEXT_NOTE", MobileBy.xpath("//android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView"));

    }
}