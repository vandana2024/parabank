package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.loginPage;

import java.util.concurrent.TimeUnit;

public class newAccountStepDefinition {
    WebDriver driver=null;

    @Given("^user click on open new account$")
    public void user_click_on_open_new_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
        loginPage login = new loginPage(driver);
        login.setUserNameTextBox("user5");
        login.setPasswordTextBox("1234");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }

    @Given("^user enter the values$")
    public void user_enter_the_values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
          System.out.println("user enters value");
    }

    @Then("^account should be created$")
    public void account_should_be_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be created");
    }

}
