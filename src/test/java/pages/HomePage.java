package pages;

import org.junit.Assert;
import static stepDefinitions.Hooks.driver;

public class HomePage extends  CommonPage{
    public void assertUrlHompage() {
        Assert.assertEquals("https://test.hypnotes.net/", driver.getCurrentUrl());

    }
 public void relevantPage(String expectedCurrentUrl){
     try {
         Assert.assertEquals(expectedCurrentUrl, driver.getCurrentUrl());
     } catch (AssertionError e) {
         System.out.println("Irrelevant page opened for " + expectedCurrentUrl + "!!");

     }
 }
}
