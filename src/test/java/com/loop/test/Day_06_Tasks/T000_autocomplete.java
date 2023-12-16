package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class T000_autocomplete extends Test_base {
    @Test (priority = 1)
    public void test1() {
        String city = "New York";
        driver.get("https://loopcamp.vercel.app/autocomplete.html");

        WebElement searchString = driver.findElement(By.xpath("//input[@id='myCountry']"));
        searchString.sendKeys(city);

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='button']"));
        submitButton.click();

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        // check actual Message after input
        actual = result.getText();
        expected = "You selected: " + city;

        System.out.println(actual + " <- equals to -> " + expected);
        Assert.assertEquals(actual, expected);

        // check Title
        actual = driver.getTitle();
        expected = "Autocomplete";

        System.out.println(actual + " <- equals to -> " + expected);
        Assert.assertEquals(actual, expected);
    }
}
