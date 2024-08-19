package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void verifyHomePage(){
        System.setProperty("WebDriver.chrome.Driver","C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        WebElement forgetPassword=driver.findElement(By.xpath("//u[text()='Forgot Password?']"));
        Assert.assertFalse(forgetPassword.isDisplayed(),"This element should be displayed.");

        WebElement createNewElement= driver.findElement(By.xpath("//u[text()='Create a new account']"));
        Assert.assertEquals(createNewElement.getText(),"Create a new account","Create a new account text should be match");
        driver.close();
    }
}
