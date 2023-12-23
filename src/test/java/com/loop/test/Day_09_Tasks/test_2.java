package com.loop.test.Day_09_Tasks;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class test_2 {
    @Test
    public void getDoc() {
        Driver.getDriver().get("https://app.docuport.app/company-formation/resident");
        List <WebElement> industries = Driver.getDriver().findElements(By.xpath("//div[@role='listbox']//following-sibling::div[@tabindex='0']"));
        String each = "";
        for (WebElement element : industries) {
            each = element.getText();
        }
        System.out.println(each);
    }
}
