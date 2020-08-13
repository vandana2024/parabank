package myproject.common;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = {"stepDefinition"},
        monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json”,
                        ”html:target/htmlReports”
        }

)
public class bankTestRunner {
}
