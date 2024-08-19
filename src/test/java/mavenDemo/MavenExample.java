package mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MavenExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("WebDriver.chrome.Driver","C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(6000);

        Thread.sleep(6000);
        driver.close();
    }
}
