package stepsPO;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsPO"},
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/reports/extentreports",
                "json:target/reports/extentreports.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/reports/dashboard.html"
        }

)
public class Runner extends AbstractTestNGCucumberTests {
}
