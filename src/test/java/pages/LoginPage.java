package pages;
import static stepDefinitions.Hooks.driver;

import enums.USER_INFO;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import java.time.Duration;

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

    @FindBy(xpath = "//button//span[text()='Yes']")
    public WebElement yesButton;


    public void loginMethod(String email, String password) {
        driver.get(ConfigurationReader.getProperty("url"));
        loginButton.click();
        getLoginPage().email.sendKeys(USER_INFO.THERAPIST_CREDENTIAL.getEmail());
        password2.sendKeys(USER_INFO.THERAPIST_CREDENTIAL.getPassword());
        login.click();
        }

    public void clickYesButton()  {
        try {
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.visibilityOf(yesButton)).click();
        } catch (NoSuchElementException | TimeoutException e) {
            // Yes button is not displayed, continue without clicking
        }
    }

    }


