package myproject.common;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/Login.Feature",
        glue= { "stepDefinition"}
)
public class loginTestRunner {
}
