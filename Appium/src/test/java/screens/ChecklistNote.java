package screens;

import io.appium.java_client.MobileBy;
import utils.PageObject;

public class ChecklistNote extends PageObject {

    public ChecklistNote() {
        final String pageName = "Checklist note";
        addPageObject(pageName,"ADD_ITEM", MobileBy.xpath("(//android.widget.ImageView)[1]"));
        addPageObject(pageName,"BACK", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        addPageObject(pageName,"CONFIRM", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        addPageObject(pageName,"CHECKLIST_NOTE_INPUT", MobileBy.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"));
        addPageObject(pageName,"WRITTEN_CHECKLIST_NOTE", MobileBy.xpath("//android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"));
        addPageObject(pageName,"OK", MobileBy.id("android:id/button1"));

    }
}