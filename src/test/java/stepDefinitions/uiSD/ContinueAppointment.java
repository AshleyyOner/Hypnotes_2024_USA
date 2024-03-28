package stepDefinitions.uiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JS_utilities;

public class ContinueAppointment extends CommonPage {
    @Given("User clicks on Next button")
    public void user_clicks_on_next_button() {
        getContinueAppointmentStep().nextButton.click();

    }

    @Then("User scroll down the page")
    public void user_scroll_down_the_page() {
        JS_utilities.scrollDownByJS();

    }

    @Then("User clicks the boxes")
    public void user_clicks_the_boxes() {
        getContinueAppointmentStep().smallButton1.isSelected();
        getContinueAppointmentStep().smallButton2.isSelected();

    }

    @Then("User clicks Submit button")
    public void user_clicks_submit_button() {
        getContinueAppointmentStep().submitButton.click();

    }

    @Then("User assert the green ikon")
    public void userAssertTheGreenIkon() {
        Assert.assertTrue(getContinueAppointmentStep().greenIkon.isDisplayed());

    }
}
