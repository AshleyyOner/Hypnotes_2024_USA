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
    @FindBy(xpath = "//button[@class= 'ant-btn css-aqx16b ant-btn-circle ant-btn-default ant-btn-lg ant-btn-icon-only d-flex justify-content-center align-items-center']")
    public WebElement scheduleAnappointmentButton;

    public void clickYes() {
        ReusableMethods.hover(timeZone);
        yes.click();
    }

//    public void clickClientSelect()  {
//        calendarButton.click();
//        //clientSelect.click();
//    }

    public void clickscheduleAnappointmentButton() {

        getAppointmentStepPage().scheduleAnappointmentButton.click();
    }

}

