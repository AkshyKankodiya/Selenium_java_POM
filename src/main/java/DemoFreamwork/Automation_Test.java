package DemoFreamwork;


import DriverFact.BrowserAction;
import DriverFact.ListnersWithScreenshotAllure;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.*;

@Listeners({ListnersWithScreenshotAllure.class})

public class Automation_Test {
    public WebDriver driver;
    Automation_Page page;
    TestNG testng = new TestNG();




    @BeforeClass
    public void setup() {
        Reporter.log("driver setup");
        BrowserAction browserAction = new BrowserAction();
        driver = browserAction.openBrowser();
        page = new Automation_Page(driver);

    }


    @Test(priority = 0)
    public void setupBrowserTest() throws InterruptedException {
        Reporter.log("go to the url ");
        page.setupBrowserpage();

    }

    @Test(priority = 1, dependsOnMethods = "setupBrowserTest")
    public void randomEmailTest() throws InterruptedException {
        Reporter.log("randome email ");
        page.randomEmailPage();

    }
    @Test(priority = 2, dependsOnMethods = "randomEmailTest")
    public void fillFormTest() throws InterruptedException {
        Reporter.log("form fillings ");
        page.fillFormPage();

        /*page.clickSetting(page.radioBtnMale);
        page.inputtext(page.fNameTextbox, ConstantData.FIRSTNAME);*/
    }

    @Test(priority = 3, dependsOnMethods = "fillFormTest")
    public void AssertionTest() {
        page.assertionPage();

    }



    @AfterClass
    public void closeDriver() {
        driver.quit();
    }



        /*page.clickSetting(page.radioBtnMale);
        page.inputtext(page.fNameTextbox, ConstantData.FIRSTNAME);*/

}
