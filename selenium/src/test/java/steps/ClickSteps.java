package steps;

import io.cucumber.java.en.Given;

import static functions.ClickFunctions.clickFieldFunction;
import static functions.ClickFunctions.clickRandomFieldFunction;

public class ClickSteps {

    @Given("^(.+): click on field ([^ ]+)$")
    public void clickField(String pageName, String fieldName) {
        clickFieldFunction(pageName, fieldName);
    }

    @Given("^(.+): click on random field ([^ ]+) and save text from it as ([^ ]+)$")
    public void clickRandomField(String pageName, String fieldName, String saveAs) {
        clickRandomFieldFunction(pageName, fieldName, saveAs);
    }
}