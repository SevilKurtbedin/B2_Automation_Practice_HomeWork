package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class task_2_v3 extends Test_base {
    @Test
    public void dropDownList() {
        driver.get("https://practice.expandtesting.com/dropdown");

        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select elementSelect = new Select(country);

        elementSelect.selectByValue("AZ");

        actual = elementSelect.getFirstSelectedOption().getText();
        System.out.println(actual);
        driver.quit();
    }
}
