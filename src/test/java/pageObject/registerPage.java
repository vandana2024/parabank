package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {

    WebDriver driver;

    public By getById(String text) {
        return By.xpath(String.format("//*[@id='%s']", text));
    }

    public By getByText(String text) {
        return By.xpath(String.format("//*[text()='%s']", text));
    }

    By FirstName = getById("customer.firstName");
    By LastName = getById("customer.lastName");
    By Address = getById("customer.address.street");
    By City = getById("customer.address.city");
    By State = getById("customer.address.state");
    By Zip = getById("customer.address.zipCode");
    By Phone = getById("customer.phoneNumber");
    By SSN = getById("customer.ssn");
    By UserName = getById("customer.username");
    By Password = getById("customer.password");
    By ConfirmPassword = getById("repeatedPassword");
    By RegisterButton = By.xpath("//input[@value='Register']");
    By CreationSuccess = getByText("Your account was created successfully. You are now logged in.");

    public registerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void FirstName (String firstName) {
        WebElement fName = driver.findElement(FirstName);
        fName.sendKeys(firstName);
    }
    public void Lastname (String lastName) {
        WebElement lName = driver.findElement(LastName);
        lName.sendKeys(lastName);
    }

    public By getAddress() {
        return Address;
    }
}