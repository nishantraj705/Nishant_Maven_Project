package parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterExample {


    public static WebDriver driver;

    /*  String courseName="Java";
    String cityName="Patna";*/
    @Parameters({"browserName"})
    @BeforeMethod
    public void preRequsite(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();//upcasting
        } else if (browserName.equalsIgnoreCase("fireFox")) {
            System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new FirefoxDriver();//upcasting
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver();//upcasting
        } else {
            throw new RuntimeException("please select correct browser name");
        }
    }
    @Parameters({"courseName" ,"cityName"})
    @Test
    public static void verifyParameterExample(String courseName,String cityName)throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement textbox=driver.findElement(By.name("q"));
        textbox.sendKeys(courseName +cityName);
        textbox.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        driver.close();


    }
}
