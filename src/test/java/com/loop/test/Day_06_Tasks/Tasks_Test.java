package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import java.util.*;

public class Tasks_Test extends Test_base {
    @Test
    public void amazonIframe(){
        driver.get("https:/www.amazon.com");
        List<WebElement> iframes = new ArrayList<>();
        iframes = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframes = " + iframes.size());
    }
}
