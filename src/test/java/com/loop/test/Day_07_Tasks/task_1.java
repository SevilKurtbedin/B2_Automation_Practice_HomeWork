package com.loop.test.Day_07_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class task_1 extends Test_base {
    /*
    1. go to https://loopcamp.vercel.app/
    2. click "Multiple Windows" link
    3. Validate "Powered by Loopcamp" is displayed
    4. Validate title is "Windows"
    5. Click - click here
    6. Switch to new window and validate title
     */
    @Test
    public void test() {
        driver.get("https://loopcamp.vercel.app/");
        WebElement clickMultipleWindows = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        clickMultipleWindows.click();

        WebElement validateText = driver.findElement(By.xpath("//div[text()='Powered by ']['LOOPCAMP']"));
        actual = validateText.getText(); // -> Powered by LOOPCAMP
        expected = "Powered by LOOPCAMP";
        Assert.assertEquals(actual, expected);

        actual = driver.getTitle(); // -> Windows
        expected = "Windows";
        Assert.assertEquals(actual, expected);

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            System.out.println("Each window handles: " + each);
            driver.switchTo().window(each);
        }
        actual = driver.getTitle(); // -> New Window
        expected = "New Window";
        Assert.assertEquals(actual, expected);
    }

}
