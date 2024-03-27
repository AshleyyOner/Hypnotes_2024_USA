package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }
    private AppointmentStepPage homePage;
    public AppointmentStepPage getHomePage() {
        if (homePage == null) {
            homePage = new AppointmentStepPage();
        }
        return homePage;
    }

}