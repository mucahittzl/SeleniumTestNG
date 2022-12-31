package clarusway.Homework;

import clarusway.utilities.BaseTest;
import com.fasterxml.jackson.core.json.PackageVersion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day1practise2  {

        /*
        Create tests that depend on each other
        Create beforeClass and set up settings.
        By creating interdependent tests;
        First go to Facebook.
        Then go to Google depending on Facebook,
        Then go to Amazon depending on Google
        Close the driver.
         */
WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void test1(){
        driver.get("https://www.facebook.com/");
        Assert.assertTrue(driver.getTitle().contains("Facebook"));
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test(dependsOnMethods ={ "test2"})
    public void test3(){
        driver.get("https://www.amazon.com/");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }

    @AfterClass
    public void afterClass(){

        driver.close();
    }

}
