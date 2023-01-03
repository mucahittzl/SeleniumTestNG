package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {

    @Test(
            threadPoolSize = 4,   //testimizi kaç çekirdekte aprallel olarak çalısacagını belirler
            invocationCount = 7  //testimizxin kac defa calısacagını belirler
    )
    public void test(){

        System.out.println("current thread ID = "+Thread.currentThread().getId());

    }
}
