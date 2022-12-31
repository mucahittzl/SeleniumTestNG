package clarusway.Homework;

import clarusway.utilities.BaseTest;
import org.testng.annotations.*;

public class Day1practise1  {

    /*
    Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.
    */


    @Test
    public void test1(){
        System.out.println("test 1 calısıyor");
    }

    @Test
    public void test2(){
        System.out.println("test 2 calısıyor");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class calısıyor");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class calısıyor");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method calısıyor");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method calısıyor");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test calısıyor");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test calısıyor");
    }

    @AfterSuite
    public void afterSuıte(){
        System.out.println("after suıte calısıyor");
    }

    @BeforeSuite
    public void beforeSuıte(){
        System.out.println("before suite calısıyor");
    }

}
