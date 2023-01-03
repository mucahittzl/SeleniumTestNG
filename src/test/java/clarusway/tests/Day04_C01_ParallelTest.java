package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.testng.annotations.Test;

public class Day04_C01_ParallelTest extends BaseCrossBrowserTest {

    @Test
    public void test01(){
        System.out.println("test 1 is running");

    }

    @Test
    public void test02(){

        System.out.println("test 2 is running");
    }
    @Test
    public void test03(){

        System.out.println("test 3 is running");
    }


}
