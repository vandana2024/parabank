package myproject.common;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import gherkin.formatter.Reporter;
import org.junit.runner.RunWith;
import sun.net.ext.ExtendedSocketOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = {"stepDefinition"},
        //plugin = {"pretty","junit:target/cucumber/report.xml"},
        // "json:target/cucumber/report.json”,
        //For extent report
        //plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber/report.html"},
        monochrome = true
)
public class bankTestRunner {

}
