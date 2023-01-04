package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.http.WebSocket;
@Listeners(Day05_C02_ITestListener.class)
public class Day05_C03_UseListener {
    @Test
    public void passedTest(){
        System.out.println("passed test");
    }

    @Test
    public void failTest(){
        System.out.println("fail test");
        Assert.fail();
    }

    @Test(timeOut = 500)
    public void timeOutTest() throws InterruptedException {
        System.out.println("timed out test");
        Thread.sleep(600);
    }
}
