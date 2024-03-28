package stepDefinitions.uiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class AccessHomePage extends CommonPage {

    @Given("user goes to the homepage")
    public void user_goes_to_the_homepage() {
        driver.get(ConfigurationReader.getProperty("url"));
        ReusableMethods.waitFor(2);
    }
    @Then("User verifies that home page is accessible")
    public void user_verifies_that_home_page_is_accessible() {
        getHomePage().assertUrlHompage();
    }
    }

