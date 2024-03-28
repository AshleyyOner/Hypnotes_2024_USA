package pages;
import static stepDefinitions.Hooks.driver;

import enums.USER_INFO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;

public class LoginPage extends CommonPage{

    @FindBy(xpath = "//span[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement email;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement password;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password1;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password2;
    @FindBy(xpath = "//button[@data-test-id='loginAsClientPage_loginButton']")
    public WebElement login;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitlogin;

    public void loginMethod(String email, String password) {
        driver.get(ConfigurationReader.getProperty("url"));
        loginButton.click();
        getLoginPage().email.sendKeys(USER_INFO.THERAPIST_CREDENTIAL.getEmail());
        password2.sendKeys(USER_INFO.THERAPIST_CREDENTIAL.getPassword());
        login.click();
    }

}
