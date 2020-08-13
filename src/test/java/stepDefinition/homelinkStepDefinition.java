package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homelinkStepDefinition {
    @Given("^user click on home icon$")
    public void user_click_on_home_icon() throws Throwable {


    }

    @Given("^user write ATM service in notepad$")
    public void user_write_ATM_service_in_notepad() throws Throwable {
        System.out.println("user write ATM service");

    }

    @Given("^user write online service in notepad$")
    public void user_write_online_service_in_notepad() throws Throwable {
        System.out.println("online service in notepad");
    }

    @Given("^user write latest news in notepad$")
    public void user_write_latest_new_in_notepad() throws Throwable {
        System.out.println("latest news");

    }

    @Then("^User should be navigate to home page$")
    public void user_should_be_navigate_to_home_page() throws Throwable {

    }

}
