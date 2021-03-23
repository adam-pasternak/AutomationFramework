package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/Selenium",
        glue = {"utils", "steps"},
        tags = "@Regression",
        plugin = {"html:target/cukes", "json:target/cucumber-esphere-report.json",
                "junit:target/cucumber-esphere-report.xml",
                "pretty"}
)
public class RegressionSeleniumRunner {}

