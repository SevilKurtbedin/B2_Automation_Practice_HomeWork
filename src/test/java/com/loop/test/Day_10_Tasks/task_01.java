package com.loop.test.Day_10_Tasks;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class task_01 {
    /*
    task1
        1. Open a Chrome browser
        2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
        3. Click and hold small circle
        4. Move it on top of the big circle
        5. validate “Now drop…” text appears on big circe
     */
    @Test (priority = 1)
    public void test_1()  {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopDragAndDrop"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        Actions actions = new Actions(Driver.getDriver());

        actions.clickAndHold(smallCircle).moveToElement(bigCircle).perform();

        String actual = bigCircle.getText(); // -> Now drop...
        String expected = "Now drop...";
        System.out.println("Actual result in test_1 is: " + actual);
        Assert.assertEquals(actual, expected);
    }
    /*
    1. Open a Chrome browser
    2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
    3. Click and hold small circle
    4. Dropped anywhere outside of big circle
    5. validate “Try again!” text appears on big circle
     */
    @Test (priority = 2)
    public void test_2() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopDragAndDrop"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement outsideOfBigCircle = Driver.getDriver().findElement(By.tagName("body"));
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(smallCircle).moveToElement(outsideOfBigCircle).click().perform();

        String actual = bigCircle.getText(); // -> Try again!
        String expected = "Try again!";
        System.out.println("Actual result in test_2 is: " + actual);

        Assert.assertEquals(actual, expected);
    }
    @AfterMethod
    public void closeTest() {
        //Driver.closeDriver();
    }
}
