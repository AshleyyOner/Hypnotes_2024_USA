package pages;

import io.cucumber.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class AppointmentStepPage extends CommonPage {
//    @FindBy(css = "[href=\"/account/home\"][class^='Sidebar']")
//    public WebElement accountOnTheSideBar;
//
//    @FindBy(xpath="//span[@title='Aaron Paul - aaronpaul@glaim.com']")
//    public WebElement clientsBox;
//
//    public void clickClientsBox(){
//        clientsBox.click();
//    }
//public void choiceOneClient(){
//
//    ReusableMethods.selectRandomTextFromDropdown();
//}

    @Given("user goes to homepage")
    public void userGoesToHomepage() throws InterruptedException {
//        driver.get(ConfigurationReader.getProperty("url"));
//        ReusableMethods.waitFor(2);


        // Input email
        WebElement emailField=driver.findElement(By.name("email"));
        emailField.sendKeys("hypnotes2022tr2@gmail.com");

        // Input password
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Aydinlik123/");

        // Click the login button
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait for redirection and page to load
        Thread.sleep(5000); // This is not best practice; consider using WebDriverWait

        // Navigate to the Calendar
        WebElement calendarButton=driver.findElement(By.xpath("//a[contains(@href, '/dashboard/calendar')]"));
        calendarButton.click();

        // Open "Schedule an Appointment" dialog
        WebElement scheduleButton=driver.findElement(By.xpath("//button[contains(text(), 'Schedule an Appointment')]"));
        scheduleButton.click();

        // Wait for the dialog to open
        Thread.sleep(2000);

        // Select a client from the dropdown (This part might need customization based on the actual HTML)
        WebElement clientDropdown=driver.findElement(By.xpath("//select[@id='clientSelect']"));
        clientDropdown.click(); // Open dropdown
        WebElement selectClient=driver.findElement(By.xpath("//option[text()='Client Name']"));
        selectClient.click(); // Select a client by visible text

        // Fill other appointment details and confirm the appointment here


    }


}

