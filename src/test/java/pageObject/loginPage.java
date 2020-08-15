package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver driver;

    //	Login Page
    By UserNameTextBox = By.xpath("//input[@name='username']");
    By PasswordTextBox = By.xpath("//input[@name='password']");
    By LogInButton = By.xpath("//input[@value='Log In']");
    By RegisterLink = getByText("Register");

    public loginPage(WebDriver driver){
        this.driver= driver;
    }


    public void setUserNameTextBox(String userName) {
        WebElement uName = driver.findElement(UserNameTextBox);
        uName.sendKeys(userName);
    }
    public void setPasswordTextBox(String password) {
        WebElement pName = driver.findElement(PasswordTextBox);
        pName.sendKeys(password);
    }

    public void LogInButton() {
        WebElement log = driver.findElement(LogInButton);
        log.click();
    }
    public void RegisterLink() {
        WebElement reg = driver.findElement(RegisterLink);
        reg.click();
    }


    public By getByText(String text) {
        return By.xpath(String.format("//*[text()='%s']", text));
    }
}
