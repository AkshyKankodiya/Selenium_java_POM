package DemoFreamwork;

import DriverFact.*;

import org.openqa.selenium.WebDriver;

import java.util.Random;



public class Automation_Page extends ElementsActions {

    // Create a BrowserAction object with an existing WebDriver instance
    public WebDriver driver;
    private BrowserAction browser;
    private ElementsActions elementsActions;
    private WaitActions waitActions;
    private Action_class actionClass;


    public Automation_Page(WebDriver driver) {
       super(driver);
        this.driver = driver;
        this.browser = new BrowserAction();
        this.elementsActions = new ElementsActions(driver);
        this.waitActions = new WaitActions(driver);
        this.actionClass = new Action_class(driver);
    }

    // Setup Browser
    public void setupBrowserpage() throws InterruptedException {
        driver.get(ConstantData.BASE_URL);


        // actionClass.clickElement(signUpbutton);
    }

    // Go to Registration page
    public void randomEmailPage() throws InterruptedException {

        actionClass.inputText(inputTextbox, ConstantData.USERNAME,"Username Text box Field");

        //To Genrate Randome Email

        actionClass.clickElement(regstrationEmail,"Registration Email Text Box" );
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        regstrationEmail.sendKeys("Akshay" + randomInt + "@gmail.com");
        System.out.println("Akshay" + randomInt + "@gmail.com");
        actionClass.clickElement(registartionButton,"Registration Email Text Box");

    }
    // fill the Registration page

    public void fillFormPage() throws InterruptedException {
        actionClass.clickElement(radioBtnMale,"Radio Button Male");
        actionClass.inputText(passWordtextbox, ConstantData.PASSWORD,"Password Text Box Field");
        actionClass.selectByVisibilityText(dayDropdown, ConstantData.DAY,"Day DropDown Field");
        actionClass.selectByIndex(monthDropdown, ConstantData.MONTH,"Month DropDown Field");
        actionClass.selectByVisibilityText(yearDropdown, ConstantData.YEAR,"Year DropDown Field");
        actionClass.inputText(fNameTextbox, ConstantData.FIRSTNAME,"First Name Text box Field");
        actionClass.inputText(lNameTextbox, ConstantData.LASTTNAME," Last Name Text box Field");
        actionClass.inputText(compTextbox, ConstantData.COMPANY," Compony Text box Field");
        actionClass.inputText(add1Textbox, ConstantData.ADDRESS1," Address 1 Text box Field");
        actionClass.inputText(add2Textbox, ConstantData.ADDRESS2," Address 2 Text box Field");
        actionClass.selectByVisibilityText(contryDropdown, ConstantData.COUNTRY," Country DropDown Field");
        actionClass.inputText(stateTextbox, ConstantData.STATE," State Text box Field");
        actionClass.inputText(cityTextbox, ConstantData.CITY," City Text box Field");
        actionClass.inputText(zipTextbox, ConstantData.ZIPCODE," ZIPCODE Text box Field");
        actionClass.inputText(mobTextbox, ConstantData.MOBILE,"Mobile Text box Field");
        actionClass.clickElement(createAccBtn,"Create Account Button");
        System.out.println("Account is created Succsessfully");



    }
    public void assertionPage(){

        actionClass.verifyAccountCreateElement(SuccessMessage);
        actionClass.verifyAccountCreateUrl(ConstantData.ExpectedSuccessPageURL);
       // actionClass.assertWithCondition(ConstantData.ExpectedSuccessPageURL,SuccessMessage);

    }




    /*
    public void clickSetting(WebElement element) throws InterruptedException {
        actionClass.clickElement(element);

    }
    public void inputtext(WebElement element,String value){
        actionClass.inputText(element, value);

    }-*/


}
