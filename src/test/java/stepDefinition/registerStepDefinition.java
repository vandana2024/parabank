package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.loginPage;

import java.util.concurrent.TimeUnit;

public class registerStepDefinition {
    WebDriver driver=null;

    @Given("^user give all details$")
    public void user_give_all_details() throws Throwable {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
        System.out.println("sag");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.firstName")).sendKeys("username8");
        driver.findElement(By.id("customer.lastName")).sendKeys("user");
        driver.findElement(By.id("customer.address.street")).sendKeys("16288");
        driver.findElement(By.id("customer.address.city")).sendKeys("Tamp");
        driver.findElement(By.id("customer.address.state")).sendKeys("FL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2274");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("049499333");
        driver.findElement(By.id("customer.ssn")).sendKeys("489499333");

        driver.findElement(By.id("customer.username")).sendKeys("username7");
        driver.findElement(By.id("customer.password")).sendKeys("1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
        loginPage login = new loginPage(driver);
        login.setUserNameTextBox("vandy");
        login.setPasswordTextBox("1234");
        driver.findElement(By.cssSelector("input[type=submit]")).click();

    }

    @When("^user click on button$")
    public void user_click_on_button() throws Throwable {
        System.out.println("user click on button for register");

    }

    @Then("^user account should be created$")
    public void user_account_should_be_created() throws Throwable {
        System.out.println("user account created");
    }

}

