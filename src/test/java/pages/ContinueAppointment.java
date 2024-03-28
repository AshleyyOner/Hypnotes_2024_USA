package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinueAppointment {

    @FindBy(xpath ="//button[@class='ant-btn css-aqx16b ant-btn-primary']" )
    public WebElement nextButton ;

    @FindBy(xpath = "//span[@class='ant-checkbox-inner']")
    public WebElement smallButton1 ;

    @FindBy(xpath = "//input[@id='sendConfirmationEmail']")
    public WebElement smallButton2;

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-lg']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='ant-result-icon']")
    public WebElement greenIkon;



}
