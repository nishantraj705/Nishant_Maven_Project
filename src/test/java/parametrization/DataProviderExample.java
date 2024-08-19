package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {

   @DataProvider(name="test-data")
    public object[][] dataFunForScript() {
        return new object[][]{
                {"selenuum","Mumbai"}
                {"selenuum","Pune"}
                {"selenuum","Delhi"}
                {"selenuum","Chennai"}

        };
   }
    @Test(dataProvider="test-data")
    public static void verifyDataProviderExample(String courseName,String cityName)throws InterruptedException {
        System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//upcasting
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement textbox=driver.findElement(By.name("q"));
        textbox.sendKeys(courseName +cityName);
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        driver.close();


    }
}

