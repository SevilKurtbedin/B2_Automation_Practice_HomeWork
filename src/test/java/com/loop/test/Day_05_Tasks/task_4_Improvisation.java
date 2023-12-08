package com.loop.test.Day_05_Tasks;

import com.loop.test.utilities.ContractInfo;
import com.loop.test.utilities.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class task_4_Improvisation {
    WebDriver driver;
    String actual;
    String expected;

    @BeforeClass
    public void setUpMethod() {
        driver = GetDriver.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDownMethod(){

    }

    @Test (priority = 1)
    public void getHerokuApp() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        // create dropdown
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropDown.getFirstSelectedOption().getText(); // by default
        expected = "Please select an option";
        Assert.assertEquals(actual, expected, "Actual massage are equal expected result");

        dropDown.selectByValue("1");
        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "Option 1", "TEST PASSED");

        dropDown.selectByValue("2");
        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "Option 2", "TEST PASSED");

        WebElement dropdownTitleName = driver.findElement(By.xpath("//h3[contains(text(),'Dropdown List')]"));
        Assert.assertEquals(dropdownTitleName.getText(), "Dropdown List", "TEST PASSED");
    }
    @Test (priority = 2)
    public void getEtsyWebsite() throws InterruptedException {
        driver.get("https://www.etsy.com/");
        WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
        search.sendKeys("rings" + Keys.ENTER);

        WebElement estimatedArrival = driver.findElement(By.xpath("//span[@class='wt-menu__trigger__label']/span"));
        Assert.assertEquals(estimatedArrival.getText(), "Estimated Arrival Any time", "Test PASSED");

        estimatedArrival.click();

        WebElement selectDayButton = driver.findElement(By.xpath("//select[@id='edd_select_tf']"));

        Select customDate = new Select(selectDayButton);
        selectDayButton.click();
        customDate.selectByVisibleText("By Dec 30");
        expected = customDate.getFirstSelectedOption().getText();
        actual = estimatedArrival.getText();
        Assert.assertTrue(actual.contains(expected));
    }
    @Test (priority = 3)
    public void getWebsite() {
        driver.get(ContractInfo.DOCUPORT_WEBSITE_LOGIN);
        WebElement goToDocPage = driver.findElement(By.xpath("//input[@id='input-14']"));
        goToDocPage.sendKeys(ContractInfo.USER_EMAIL + Keys.TAB + ContractInfo.USER_PASSWORD + Keys.ENTER);

        WebElement receivedDoc = driver.findElement(By.xpath("//h2[text()='Received ']"));
        receivedDoc.click();
        WebElement search = driver.findElement(By.xpath("//button[@class='mr-3 mb-1 mb-sm-0 v-btn v-btn--has-bg theme--light v-size--large']"));
        search.click(); // //i[text()='Search']

        WebElement status = driver.findElement(By.xpath("//label[text()='Status']"));
        status.click();


        WebElement inProgress = driver.findElement(By.xpath("//div[@class='v-list-item__title' and text()='In progress']"));
        inProgress.click();
        System.out.println(inProgress.getText());

        actual = inProgress.getText();
        expected = "In progress";
        Assert.assertEquals(actual, expected, "TEST PASSED");
    }
}
