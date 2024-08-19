package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAndAfterMethod_1 {

    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("WebDriver.chrome.Driver","C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver =new ChromeDriver();
    }
    @Test
    public void testForRediffMail_1()throws InterruptedException{

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }
    @Test
    public void  testForFlipkart()throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }
    @Test
    public void  testForWhatsapp_3()throws InterruptedException {
        driver.get("https://web.whatsapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
