package DriverFact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ElementsActions {


    public WebDriver driver;

    @FindBy(xpath = "//a[contains(text(), 'Signup / Login')]")
    public WebElement signUpbutton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement inputTextbox;
    @FindBy(xpath = "//input[@data-qa='signup-email' and @type ='email' ]")
    public WebElement regstrationEmail;
    @FindBy(xpath = "//button[text()='Signup' and @ type = 'submit']")
    public WebElement registartionButton;
    @FindBy(xpath = "//input[@id='id_gender1' and @name = 'title']")
    public WebElement radioBtnMale;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameTextbox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWordtextbox;
    @FindBy(xpath = "//select[@name='days']")
    public WebElement dayDropdown;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthDropdown;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearDropdown;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement fNameTextbox;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lNameTextbox;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement compTextbox;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement add1Textbox;
    @FindBy(xpath = "//input[@id ='address2' and @name='address2']")
    public WebElement add2Textbox;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement contryDropdown;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateTextbox;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityTextbox;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipTextbox;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobTextbox;
    @FindBy(xpath = "//button[text()='Create Account' and @type ='submit']")
    public WebElement createAccBtn;
    // Assuming there's a success message displayed after account creation
    @FindBy(xpath = "//p[contains(text(), 'Congratulations')]")
    public WebElement SuccessMessage;


    public ElementsActions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}





