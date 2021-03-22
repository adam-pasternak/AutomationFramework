package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/features",
            glue = {"utils", "steps"},
            tags = "@Debug",
            plugin = {"html:target/cukes", "json:target/cucumber-esphere-report.json",
                    "junit:target/cucumber-esphere-report.xml",
                    "pretty"}
    )
    public class DebugSeleniumRunner {}

