package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task_2_v2 extends Test_base {
    @Test (priority = 1)
    public void externalAndInternalIFrame() throws InterruptedException {
        driver.get("https://practice.expandtesting.com/iframe");

        JavascriptExecutor js = (JavascriptExecutor) driver; // a little search from Google
        js.executeScript("window.scrollBy(0,700);"); // -> scroll DOWN

        System.out.println(driver.getTitle()); // title
            Thread.sleep(3000);
        driver.switchTo().frame("mce_0_ifr");
        WebElement externalIframe = driver.findElement(By.xpath("//body[@id='tinymce']"));
        actual = externalIframe.getText();
        expected = "Your content goes here.";
        System.out.println("\t1. " + actual + " <- equals to -> " + expected); // print message
        Assert.assertEquals(actual, expected);

        externalIframe.clear();
        externalIframe.sendKeys("We've cleaned up this line, now let's move on to another one");

        driver.switchTo().defaultContent();
            Thread.sleep(3000);
        driver.switchTo().frame("email-subscribe");
        WebElement internalIFrame = driver.findElement(By.xpath("//input[@id='email']"));
        internalIFrame.sendKeys("b1g2_super" + Keys.ENTER); // for example
        actual = driver.findElement(By.xpath("//div[@class='invalid-feedback']")).getText();
        expected = "Please enter a valid email address.";
        Assert.assertEquals(actual, expected); // test
        System.out.println("\t2. " + actual + " <- equals to -> " + expected); // print message

        internalIFrame.clear();
            Thread.sleep(3000);
        internalIFrame.sendKeys("b1g2_super@gmail.com" + Keys.ENTER);
            Thread.sleep(3000);
        actual = driver.findElement(By.xpath("//div[@id='success-message']")).getText();
        expected = "You are now subscribed!";
        Assert.assertEquals(actual, expected); // test
        System.out.println("\t3. " + actual + " <- equals to -> " + expected); // print message

        driver.quit(); // Bye bye
    }
}
