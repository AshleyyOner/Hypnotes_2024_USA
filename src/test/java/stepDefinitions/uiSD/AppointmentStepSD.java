package stepDefinitions.uiSD;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class AppointmentStepSD extends CommonPage {
    @And("user clicks on the schedule an appointment button")
    public void user_clicks_on_the_schedule_an_appointment_button() throws InterruptedException {
       Thread.sleep(5000);
       //getAppointmentStepPage().clickYes();
        getLoginPage().clickYesButton();
        Thread.sleep(5000);
        getAppointmentStepPage().clickscheduleAnappointmentButton();
        Thread.sleep(5000);

    }
}