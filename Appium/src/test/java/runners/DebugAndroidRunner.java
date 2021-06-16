package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"utils", "steps"},
        tags = "@Debug",
        plugin = {"html:target/cukes", "json:target/report.json",
                "junit:target/report.xml",
                "pretty"}
)
public class DebugAndroidRunner {}

