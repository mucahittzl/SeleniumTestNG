package clarusway.Homework;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Day1practise3 extends BaseTest{

    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.

     */



    @Test
    public void positiveLogin() {
        driver.get(" https://practicetestautomation.com/practice-test-login/");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        WebElement newPage = driver.findElement(By.id("modern-store-modified"));
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),
                "beklenen URL bulunamadı");
        WebElement area = driver.findElement(By.xpath("//div[@id='loop-container']//p"));
        Assert.assertTrue(area.getText().contains("You successfully logged in!"), "Aranan yazı görüntüelnemiyor");
        WebElement logOut = driver.findElement(By.xpath("//a[.='Log out']"));
        Assert.assertTrue(logOut.isDisplayed());
        logOut.click();
    }

         /*
         Test Case2: Negative Username Test
         Open page https://practicetestautomation.com/practice-test-login/
         Type username incorrectUser into Username field.
         Type password Password123 into Password field.
         Puch Submit button.
         Verify error message is displayed.
         Verify error message text is Your username is invalid!
          */

    @Test
    public void negativeUsername(){

        driver.get(" https://practicetestautomation.com/practice-test-login/");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("adsads");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        WebElement error= driver.findElement(By.id("error"));
        Assert.assertTrue(error.isDisplayed());
        Assert.assertTrue(error.getText().contains("Your username is invalid!"));
    }

         /*
         Test Case3: Negative Password Test
         Open page https://practicetestautomation.com/practice-test-login/
         Type username student into Username field.
         Type password incorrectPassword into Password field.
         Puch Submit button.
         Verify error message is displayed.
         Verify error message text is Your password is invalid!
          */

    @Test
    public void negativePassword(){

        driver.get(" https://practicetestautomation.com/practice-test-login/");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("assword13");
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
        WebElement newPage = driver.findElement(By.id("modern-store-modified"));

        WebElement area = driver.findElement(By.xpath("//div[@id='loop-container']//p"));
        Assert.assertTrue(area.getText().contains("You successfully logged in!"), "Aranan yazı görüntüelnemiyor");
        WebElement logOut = driver.findElement(By.xpath("//a[.='Log out']"));
        Assert.assertTrue(logOut.isDisplayed());
        logOut.click();

    }

    }
