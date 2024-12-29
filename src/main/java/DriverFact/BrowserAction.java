package DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserAction {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

    public static synchronized WebDriver getDriver() {
        return tdriver.get();
    }

    public WebDriver openBrowser() {
        // set dynamic path for run all type
       // String path = System.getProperty("user.dir") + "\\Webdriver\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        tdriver.set(driver);

        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.navigate().to("https://automationexercise.com/");
        return driver;


    }
    }





