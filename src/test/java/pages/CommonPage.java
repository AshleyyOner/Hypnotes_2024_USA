package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    private AppointmentStepPage appointmentStepPage;
    public AppointmentStepPage getAppointmentStepPage() {
        if (appointmentStepPage == null) {
            appointmentStepPage = new AppointmentStepPage();
        }
        return appointmentStepPage;
    }


    private HomePage homePage;
    private LoginPage loginPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


}