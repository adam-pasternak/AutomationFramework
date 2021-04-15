package screens;

import io.appium.java_client.MobileBy;
import utils.PageObject;

public class TextNote extends PageObject {

    public TextNote() {
        final String pageName = "Text note";
        addPageObject(pageName,"BACK", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        addPageObject(pageName,"CONFIRM", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn"));
        addPageObject(pageName,"NOTE_INPUT", MobileBy.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note"));

    }
}