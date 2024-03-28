package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;


import java.lang.reflect.InvocationTargetException;

import static stepDefinitions.Hooks.driver;

public class AppointmentStepPage extends CommonPage {

    @FindBy(xpath = "//span[@title='Aaron Paul - aaronpaul@glaim.com']")
    public WebElement clientsBox;
    @FindBy(xpath = ("//select[@id='clientSelect']"))
    public WebElement clientSelect;
    @FindBy(xpath = "//a[@href='/dashboard/calendar']")
    public WebElement calendarButton;
    @FindBy(xpath = "//div[@class='ant-modal-confirm-body-wrapper']")
    public WebElement timeZone;
    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    public WebElement yes;
    @FindBy(xpath = "//img[@alt='calendaricon']")
    public WebElement scheduleAnappointmentButton;

    public void clickYes() {
        ReusableMethods.hover(timeZone);
        yes.click();
    }

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/button[1]/span[1]/span[1]/img[1]")
    public WebElement newEvent;

//    public void clickClientSelect()  {
//        calendarButton.click();
//        //clientSelect.click();
//    }

    public void clickscheduleAnappointmentButton() throws InterruptedException {
Thread.sleep(3000);
        getAppointmentStepPage().scheduleAnappointmentButton.click();
    }

//    public void newer() {
//        newEvent.click();
//
//    }
}