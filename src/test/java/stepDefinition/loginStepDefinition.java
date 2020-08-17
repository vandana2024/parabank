package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.loginPage;


import java.util.concurrent.TimeUnit;

public class loginStepDefinition {

 WebDriver driver=null;
 loginPage login;

    @Given("^user enters \"(.*?)\" and \"(.*?)\"$")
    public void user_enters_with(String arg1, String arg2) throws Throwable {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        loginPage login = new loginPage(driver);
        login.setUserNameTextBox("username7");
        login.setPasswordTextBox("1234");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
        //Assert.assertTrue(driver.findElement(By.cssSelector("#rightPanel p")).getText().contains("The username and password could not be verified."));
        //driver.quit();
        ;

    }

    @When("^user click \"(.*?)\" button$")
    public void user_click_button() throws Throwable {
        login = new loginPage(driver);
        login.LogInButton();
        //driver.findElement(By.cssSelector("input[type=submit]")).click();
        System.out.println("user click on button ");

    }

    @Then("^user should see \"(.*?)\"$")
    public void user_should_see(String arg1) throws Throwable {
        System.out.println("user should see the homepage");

    }


}
