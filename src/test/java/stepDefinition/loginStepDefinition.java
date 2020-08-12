package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDefinition {
    @Given("^opening google$")
    public void opening_google() throws Throwable {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
    }

    @When("^Searching in google$")
    public void searching_in_google() throws Throwable {
        System.out.println("This is step 2");

    }

    @Then("^closing google$")
    public void closing_google() throws Throwable {
        System.out.println("This is step 3");

    }

}
