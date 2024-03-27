package pages;
import static stepDefinitions.Hooks.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
