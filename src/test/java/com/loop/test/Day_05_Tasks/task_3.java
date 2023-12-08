package com.loop.test.Day_05_Tasks;

import com.loop.test.utilities.ContractInfo;
import com.loop.test.utilities.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class task_3 {
    WebDriver driver;
    String actual;
    String expected;

    @BeforeClass
    public void setUpMethod() {
        driver = GetDriver.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
    @Test
    public void getWebsite() throws InterruptedException {

        driver.get(ContractInfo.DOCUPORT_WEBSITE_LOGIN);
        WebElement goToDocPage = driver.findElement(By.xpath("//input[@id='input-14']"));
        goToDocPage.sendKeys(ContractInfo.USER_EMAIL + Keys.TAB + ContractInfo.USER_PASSWORD + Keys.ENTER);

        WebElement receivedDoc = driver.findElement(By.xpath("//div[@class='doc-card--icon d-flex justify-end']"));
        receivedDoc.click();
        WebElement search = driver.findElement(By.xpath("//button[@class='mr-3 mb-1 mb-sm-0 v-btn v-btn--has-bg theme--light v-size--large']"));
        search.click();



        WebElement status = driver.findElement(By.xpath("//input[@id='input-120']"));
        status.click();
        Thread.sleep(3000);

        WebElement inProgress = driver.findElement(By.xpath("//div[@class='v-list-item__title' and text()='In progress']"));
        inProgress.click();
        System.out.println(inProgress.getText());

        actual = inProgress.getText();
        expected = "In progress";
        Thread.sleep(3000);
        Assert.assertEquals(actual, expected, "TEST PASSED");

    }
}
