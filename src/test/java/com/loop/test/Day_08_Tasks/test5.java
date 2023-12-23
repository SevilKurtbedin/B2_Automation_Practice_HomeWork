package com.loop.test.Day_08_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class test5 extends Test_base {
    @Test
    public void getNBA() {
        driver.get("https://www.nba.com/");
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@title='Scoreboard Date Picker']")));
        // first type by firstSelectOption
        System.out.println(dropdown.getFirstSelectedOption().getText()); // 21 Dec
        // 1. xPath by text(): //select[@title='Scoreboard Date Picker']//option[text()='Tue, Dec 19']
        // 2. xPath by value: //select[@title='Scoreboard Date Picker']//option[@value='2023-12-19']
        // 3. xPath by Index: //select[@title='Scoreboard Date Picker']//option[1]
        dropdown.selectByValue("2023-12-19"); // by  Value
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(1); // here in Index '2' we have: Wed, Dec 20
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Fri, Dec 22"); // by visible text
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
