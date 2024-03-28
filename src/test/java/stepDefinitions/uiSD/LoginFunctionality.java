package stepDefinitions.uiSD;

import enums.LINKS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;
import static utilities.ConfigurationReader.properties;

public class LoginFunctionality extends CommonPage {

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {

   getLoginPage().loginButton.click();
    }
    @Then("User verify Email address should be functional")
    public void user_verify_email_address_should_be_functional() {
        getLoginPage().email.click();
        Assert.assertTrue(getLoginPage().email.isEnabled());
    }
    @Then("User verify password button should be functional")
    public void user_verify_password_button_should_be_functional() {
        getLoginPage().password.click();
        Assert.assertTrue(getLoginPage().password.isEnabled());
    }

    @Then("User enters valid email and password")
    public void userEntersValidEmailAndPassword() {
        getLoginPage().email.sendKeys(properties.getProperty("userTherapist2"));
        getLoginPage().password2.sendKeys(properties.getProperty("password"));
        ReusableMethods.waitForClickability(getLoginPage().login,10).click();

    }
    @When("System clean email and password boxes")
    public void system_clean_email_and_password_boxes() {
        getLoginPage().email.clear();
        getLoginPage().password.clear();
    }
    @Then("When it is clicked Login button and relevant page should be displayed.")
    public void when_it_is_clicked_login_button_and_relevant_page_should_be_displayed()  {
        getHomePage().relevantPage(LINKS.EXPECTED_LINKS.getCalendarUrl());

    }


}
