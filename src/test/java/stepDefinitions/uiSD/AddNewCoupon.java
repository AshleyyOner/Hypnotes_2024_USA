package stepDefinitions.uiSD;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class AddNewCoupon extends CommonPage {
    @Given("User clicks on coupon section")
    public void user_clicks_on_coupon_section() throws InterruptedException {
        Thread.sleep(5000);
      getAddNewCouponPage().clickCouponSection();
      getAddNewCouponPage().clickAddNewCouponButton();
        String expectedUrl= "https://test.hypnotes.net/dashboard/coupons";
        System.out.println("expectedUrl= " + expectedUrl);
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl= "+ actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);
        ReusableMethods.waitFor(2);
    }
}
