package clarusway.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {

    public static String getScreenShot(WebDriver driver, String name) throws IOException {

        //Screenshot dosya ismi için su an ki tarihi string olarak alıyoruz
        String date = formatCurrentDate("yyyyMMddhhmmss");

        //screenshot alıp file objesine atadık
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //kaydedilecek dosyanın yolunu belirliyoruz
        String target = System.getProperty("user.dir")+ "\\test-output\\Screenshots\\"+name +date+".png";

        File targetFile = new File(target);

        //Kaynagı hedefe kopyalıyoruz
        FileUtils.copyFile(source,targetFile);

        return target;
    }



    public static String formatCurrentDate(String pattern){
      return   new SimpleDateFormat(pattern).format(new Date());
    }

}
