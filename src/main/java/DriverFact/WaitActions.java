package DriverFact;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WaitActions {
    public WebDriver driver;

    public WaitActions(WebDriver driver) {
        this.driver = driver;
    }

    public void Explicitly_Clickeble(WebElement element) {
        //System.out.println("Waiting for clickeble Element");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }

    public void Explicitly_Visible(WebElement element) {
        System.out.println("Waiting for Visible Element");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }

    public boolean isElementPresentAndClick(WebElement element, String enteredFieldName) {
        try {
            if (element.isDisplayed()) {
                String selectedFieldName = element.getAttribute("name");
                //System.out.println(" Selected field is : "+selectedFieldName);

                return true;
            }
        } catch (NoSuchElementException e) {
            System.out.println(enteredFieldName + " not found: " + element);
            return false;
        }

        return false;
    }


}