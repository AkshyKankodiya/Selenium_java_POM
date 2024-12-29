package DriverFact;

import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersTest extends TestListenerAdapter {
    public void onTestStart(ITestResult tr) {
        System.out.println("The Test is start");
    }

    public void onTestSuccess(ITestResult tr) {
        System.out.println("The test is pass");

    }

    public void onTestFailure(ITestResult tr) {
        System.out.println("The test is fail");


    }

    public void onTestSkipped(ITestResult tr) {
        System.out.println("The test is skipps");

    }


}