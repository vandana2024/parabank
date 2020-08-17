package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;


public class baseutil {
    public WebDriver Driver;
    public ExtentReports extent;

    public static ExtentTest stepDefinitions;
    public static ExtentTest features;
    public static String reportLocation = "/users/vandana/reports/";
}
