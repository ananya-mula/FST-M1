package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity5",
        plugin = {"html: test-reports"},
        monochrome = true
)
public class Activity6 {
}
