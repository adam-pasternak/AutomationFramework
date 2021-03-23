package steps;

import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.galenframework.api.Galen.checkLayout;
import static functions.SpecificFunctions.addRandomProductToCartFunction;
import static functions.SpecificFunctions.buttonOfRandomlySelectedProductHasValueFunction;
import static utils.WebDriverProvider.getWebDriver;

public class SpecificSteps {

    @Given("^(.+): add random product to cart")
    public void addRandomProductToCart(String pageName) {
        addRandomProductToCartFunction(pageName);
    }

    @Given("^(.+): button of randomly selected product has value (.+)")
    public void buttonOfRandomlySelectedProductHasValue(String pageName, String value) {
        buttonOfRandomlySelectedProductHasValueFunction(pageName, value);
    }

    @Given("Page layout matches requirements described in ([^ ]+)$")
    public void checkPageLayout(String layoutFile) throws IOException {
        LayoutReport layoutReport;
        layoutReport = checkLayout(getWebDriver(), "src/test/java/layouts/" + layoutFile, Arrays.asList("desktop"));
        List<GalenTestInfo> tests = new LinkedList<>();
        GalenTestInfo test = GalenTestInfo.fromString(layoutFile);
        test.getReport().layout(layoutReport, layoutFile + " - elements verification");
        tests.add(test);
        new HtmlReportBuilder().build(tests, "target/galen-html-reports");
        Assert.assertFalse(layoutReport.getValidationErrorResults().size() > 0 ? layoutReport.getValidationErrorResults().get(0).getError().getMessages().get(0) : "", test.isFailed());
    }
}