package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Test_base {
    public WebDriver driver;
    public String actual;
    public String expected;
    @BeforeMethod
    public void starts() {
        driver = GetDriver.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void ends() {
        driver.quit();
    }
}
