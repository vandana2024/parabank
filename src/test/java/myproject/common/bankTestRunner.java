package myproject.common;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"stepDefinition"},
        plugin = {"pretty","junit:target/cucumber/report.xml",
        // "json:target/cucumber/report.json”,
        //For extent report
        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber/report.html"},
        monochrome = true
)
public class bankTestRunner {

}
