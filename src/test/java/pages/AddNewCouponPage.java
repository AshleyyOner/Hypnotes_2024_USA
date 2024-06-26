package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static stepDefinitions.Hooks.driver;

public class AddNewCouponPage extends CommonPage{
    @FindBy(xpath = "//a[text()='Coupons']")
    private WebElement couponsSectionButton;

    @FindBy(css = "button.ant-btn.css-aqx16b.ant-btn-primary.d-flex.align-items-center")
    private WebElement addNewCouponButton;

    public void clickCouponSection()  {
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        couponsSectionButton.click();
    }

    public void clickAddNewCouponButton(){
        addNewCouponButton.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }
}
