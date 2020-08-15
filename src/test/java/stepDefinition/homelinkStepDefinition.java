package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.loginPage;

import java.util.concurrent.TimeUnit;

public class homelinkStepDefinition {

    WebDriver driver=null;

    @Given("^user click on home icon$")
    public void user_click_on_home_icon() throws Throwable {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]")).click();
        loginPage login = new loginPage(driver);
        login.setUserNameTextBox("username1");
        login.setPasswordTextBox("1234");
        driver.findElement(By.cssSelector("input[type=submit]")).click();
    }

    @And("^user write ATM service in notepad$")
    public void user_write_ATM_service_in_notepad() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]")).click();
        System.out.println("user write ATM service");
    }

    @And("^user write online service in notepad$")
    public void user_write_online_service_in_notepad() throws Throwable {
        System.out.println("online service in notepad");

    }

    @And("^user write latest news in notepad$")
    public void user_write_latest_new_in_notepad() throws Throwable {
        System.out.println("latest news");

    }

    @Then("^User should be navigate to home page$")
    public void user_should_be_navigate_to_home_page() throws Throwable {
      System.out.println("user navigated to homepage");
    }

}
