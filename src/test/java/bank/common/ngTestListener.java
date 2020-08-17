package bank.common;
import base.extentReportUtil;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static base.baseutil.features;


public class ngTestListener implements ITestListener {

    extentReportUtil extentReportUtil = new extentReportUtil();

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("On test start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("On test Success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On test failure");

        try{
            extentReportUtil.ExtentReportScreenshot();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("On test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("On test percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("On start");

        extentReportUtil.ExtentReport();

        //ToDo: Feature - Hard coding the feature name
        features = extentReportUtil.extent.createTest(Feature.class, "login.features");

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("On finish");
        extentReportUtil.FlushReport();
    }
}