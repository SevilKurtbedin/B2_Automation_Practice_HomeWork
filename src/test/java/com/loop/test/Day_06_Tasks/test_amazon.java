package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test_amazon extends Test_base {
    @Test
    public void getAmazon() {
        driver.get("https://www.amazon.com/");
        WebElement searchString = driver.findElement(By.xpath("//input[@type='text']"));
        searchString.sendKeys("ball" + Keys.ENTER);

    }
}
