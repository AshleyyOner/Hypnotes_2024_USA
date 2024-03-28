package stepDefinitions.uiSD;

import io.cucumber.java.en.Given;
import pages.CommonPage;

public class AddNewCoupon extends CommonPage {
    @Given("User clicks on coupon section")
    public void user_clicks_on_coupon_section() {
      getAddNewCouponPage().clickCouponSection();
      getAddNewCouponPage().clickAddNewCouponButton();
    }
}
