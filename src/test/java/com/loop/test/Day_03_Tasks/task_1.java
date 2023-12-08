package com.loop.test.Day_03_Tasks;
import com.loop.test.utilities.ContractInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class task_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

//      create driver object
        WebDriver driver = new ChromeDriver();

//      1. login to docuport application
        driver.get(ContractInfo.DOCUPORT_WEBSITE_LOGIN); // https://beta.docuport.app/login/
//      * - HERE WE GO TO INPUT OUR EMAIL
        WebElement login = driver.findElement(By.id("input-14"));
        login.sendKeys(ContractInfo.USER_EMAIL);
//      * - HERE WE GO TO INPUT OUR PASSWORD
        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(ContractInfo.USER_PASSWORD, Keys.ENTER);
        Thread.sleep(3000);
        driver.manage().window().maximize();
//      2.  validate successful login
        System.out.println(driver.getCurrentUrl().equals("https://beta.docuport.app/") ? "TEST PASSED : DOCUPORT APPLICATION IS OPEN" : "TEST FAILED : DOCUPORT APPLICATION IS NOT OPEN");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div [class='d-flex align-center']")).click();
        driver.findElement(By.cssSelector("div [id='list-item-109']")).click();
        Thread.sleep(3000);
        driver.manage().window().minimize();
//      3.  validate successful logout
        System.out.println(driver.getCurrentUrl().equals("https://beta.docuport.app/login") ? "TEST PASSED : DOCUPORT APPLICATION IS LOGOUT" : "TEST FAILED : DOCUPORT APPLICATION IS STILL LOGIN");
//      4.  logout from docuport application
        driver.quit();

    }
}
