package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestng {

    @Test(groups = {"sanity"})
    public void  testcase_1(){
        System.setProperty("WebDriver.chrome.Driver","C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void  testcase_2() {
        System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void  testcase_3() {
        System.setProperty("WebDriver.chrome.Driver", "C:\\Users\\nishant\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    }
