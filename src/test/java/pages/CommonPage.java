package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    private HomePage homePage;
    private LoginPage loginPage;
    private AppointmentStepPage appointmentStepPage;

    private AddNewCouponPage addNewCouponPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage=new HomePage();
        }
        return homePage;
    }


    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage=new LoginPage();
        }
        return loginPage;
    }


    public AppointmentStepPage getAppointmentStepPage() {
        if (appointmentStepPage == null) {
            appointmentStepPage=new AppointmentStepPage();
        }
        return appointmentStepPage;
    }



    public AddNewCouponPage getAddNewCouponPage() {
        if (addNewCouponPage == null) {
           addNewCouponPage = new AddNewCouponPage();
        }
        return addNewCouponPage;
    }


}