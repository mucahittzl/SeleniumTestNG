package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {

@Test(dataProvider = "getData")
    public void test01(String username, String email, String password, int number){

    System.out.println("username = "+username);
    System.out.println("password = "+password);
    System.out.println("email    = "+email);
    System.out.println("number   = "+number);

    }
        @DataProvider
        public Object[][] getData(){

    Object[][] data ={

            {"Karl","karl@gmail.com","123",1},
            {"Drake","drake@gmail.com","abc",2},
            {"Garry","garry@gmail.com","abc123",3},
            {"Elly","elly@gmail.com","def123",4}
    };
            return data;


     }

}
