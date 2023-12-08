package com.loop.test.Day_03_Tasks;

import com.loop.test.utilities.ContractInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class task_2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
//      1. navigate to docuport application
        driver.get(ContractInfo.DOCUPORT_WEBSITE_LOGIN);
//      2. validate placeholders for user name and password
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("label[for='input-14']")).getText().equalsIgnoreCase(ContractInfo.PLACEHOLDER_FOR_USERNAME) ?
                        "TEST PASSED -> PLACEHOLDER HAVE A TEXT \"USERNAME OR EMAIL\"" : "TEST FAILED -> PLACEHOLDER HAVEN'T A TEXT \"USERNAME OR EMAIL\"");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("label[for='input-15']")).getText().equalsIgnoreCase(ContractInfo.PLACEHOLDER_FOR_PASSWORD) ?
                "TEST PASSED -> PLACEHOLDER HAVE A TEXT \"PASSWORD\"" : "TEST FAILED -> PLACEHOLDER HAVEN'T A TEXT \"PASSWORD\"");
//      3. without sending username and password click login button
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//      4.  4. validate username and password error messages
        Thread.sleep(2000);
        ArrayList < WebElement> massage = (ArrayList<WebElement>) driver.findElements(By.cssSelector("div[class='v-messages__message']"));
        System.out.println(massage.get(0).getText().equals("Please enter your username or email address") ? "TEST PASSED -> for userName" : "TEST FAILED");
        Thread.sleep(2000);
        System.out.println(massage.get(1).getText().equals("Please enter your password") ? "TEST PASSED -> for password" : "TEST FAILED");
        driver.quit();

    }
}
