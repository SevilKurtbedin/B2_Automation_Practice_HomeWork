package com.loop.test.Day_04_Tasks;

import com.loop.test.utilities.ContractInfo;
import com.loop.test.utilities.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class task_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = GetDriver.getDriver((String) ContractInfo.ALL_BROWSERS.get(0));
        getUrl(driver, "https://beta.docuport.app/login");

        driver.manage().window().maximize();

        goToElement(driver, "//input[@id='input-14']", ContractInfo.USER_EMAIL);
        goToElement(driver, "//input[@id='input-15']", ContractInfo.USER_PASSWORD + Keys.ENTER);

        Thread.sleep(3000);

        findElementByXPath(driver, "//span[text()='Home']", "Home");
        findElementByXPath(driver, "//span[text()='Received docs']", "Received docs");
        findElementByXPath(driver, "//span[text()='My uploads']", "My uploads");
        findElementByXPath(driver, "//span[text()='Invitations']", "Invitations");

//        findByRegularXPath(driver, "span", "class", "body-1");
        Thread.sleep(3000);

        goToElement(driver, "//button[@class='v-app-bar__nav-icon v-btn v-btn--icon v-btn--round theme--light v-size--default']");

        Thread.sleep(3000);

        isDisplayed(driver, "Home");
        isDisplayed(driver, "Received docs");
        isDisplayed(driver, "My uploads");
        isDisplayed(driver, "Invitations");

        driver.quit();

    }

    public static void getUrl(WebDriver driver, String input) {
        driver.get(input);
    }
    public static WebElement goToElement (WebDriver driver, String xPath, String userInfo) {
        WebElement element = driver.findElement(By.xpath(xPath));
        element.sendKeys(userInfo);
        return element;
    }
    public static WebElement goToElement (WebDriver driver, String xPath) {
        WebElement element = driver.findElement(By.xpath(xPath));
        element.click();
        return element;
    }
    public static WebElement findElementByXPath(WebDriver driver, String xPath, String elementsName) {
        WebElement findByXPath = driver.findElement(By.xpath(xPath));
        if (findByXPath.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a \"" + elementsName + "\" BUTTON");
        else
            System.out.println("TEST FAILED -> \"" + elementsName + "\" IS NOT DISPLAYED");
        return findByXPath;
    }
    public static void isDisplayed (WebDriver driver, String isDisappear) {
        WebElement element = driver.findElement(By.xpath("//span[text()='" + isDisappear + "']"));
        if (!element.isDisplayed())
            System.out.println("TEST PASSED -> \"" + isDisappear + "\" button are DISAPPEAR");
        else
            System.out.println("TEST FAILED -> \"" + isDisappear + "\" button are NOT DISAPPEAR");
    }

    public static void findByRegularXPath (WebDriver driver, String tagName, String attribute, String value) {
        WebElement findByXPath = driver.findElement(By.xpath("//" + tagName + "[@" + attribute + "='" + value + "']"));
        if (findByXPath.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a your value");
        else
            System.out.println("TEST FAILED -> IS NOT DISPLAYED");
    }
    public static void findByNameXPath (WebDriver driver, String tagName, String value) {
        WebElement findByXPath = driver.findElement(By.xpath("//" + tagName + "[text()='" + value + "']"));
        if (findByXPath.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a your value");
        else
            System.out.println("TEST FAILED -> IS NOT DISPLAYED");
    }
}
