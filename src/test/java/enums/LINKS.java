package enums;

public enum LINKS {
    EXPECTED_LINKS("https://test.hypnotes.net/dashboard/calendar",
            "https://test.hypnotes.net/dashboard/coupons");
    private final String CalendarUrl;
    private final String CouponUrl;

    LINKS(String calendarUrl,String couponUrl){
        CalendarUrl=calendarUrl;
        CouponUrl=couponUrl;
    }
    public String getCalendarUrl(){return  CalendarUrl;}
    public String getCouponUrl(){return CouponUrl;}
}
