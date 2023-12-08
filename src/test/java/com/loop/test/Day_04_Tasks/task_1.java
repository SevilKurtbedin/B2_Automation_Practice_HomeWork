package com.loop.test.Day_04_Tasks;

import com.loop.test.utilities.ContractInfo;
import com.loop.test.utilities.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = GetDriver.getDriver("chrome");
        driver.manage().window().maximize();
        // 1. Go to docuport app
        driver.get("https://beta.docuport.app/login");
        // Enter login
        WebElement goToLogin = driver.findElement(By.xpath("//input[@id='input-14']"));
        goToLogin.sendKeys(ContractInfo.USER_EMAIL);
        // Enter password
        WebElement goToPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        goToPassword.sendKeys(ContractInfo.USER_PASSWORD + Keys.ENTER);
        // Need to sleep a little bit
        Thread.sleep(3000);
        // # Validate "Home" button
        WebElement validateHome = driver.findElement(By.xpath("//span[text()='Home']"));

        if (validateHome.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a \"Home\" BUTTON");
        else
            System.out.println("TEST FAILED -> \"Home\" IS NOT DISPLAYED");
        // # Validate "Received docs" button
        WebElement validateReceived = driver.findElement(By.xpath("//span[text()='Received docs']"));

        if (validateReceived.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a \"Received docs\" BUTTON");
        else
            System.out.println("TEST FAILED -> \"Received docs\" IS NOT DISPLAYED");
        // # Validate "My uploads" button
        WebElement validateMyUploads = driver.findElement(By.xpath("//span[text()='My uploads']"));

        if (validateMyUploads.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a \"My uploads\" BUTTON");
        else
            System.out.println("TEST FAILED -> \"My uploads\" IS NOT DISPLAYED");
        // # Validate "Invitations" button
        WebElement validateInvitations = driver.findElement(By.xpath("//span[text()='Invitations']"));

        if (validateInvitations.isDisplayed())
            System.out.println("TEST PASSED -> Website: " + ContractInfo.DOCUPORT_WEBSITE_LOGIN + " have a \"Invitations\" BUTTON");
        else
            System.out.println("TEST FAILED -> \"Invitations\" IS NOT DISPLAYED");
        // if we use minimize window we need to click this button: driver.findElement(By.xpath("//div[@class='v-overlay__scrim']")).click();
        // # Validate press three lines
        Thread.sleep(3000);
        WebElement threeLines = driver.findElement(By.xpath("//button[@class='v-app-bar__nav-icon v-btn v-btn--icon v-btn--round theme--light v-size--default']"));
        threeLines.click();
        Thread.sleep(3000);

        if (!validateHome.isDisplayed() && !validateReceived.isDisplayed() && !validateReceived.isDisplayed() && !validateMyUploads.isDisplayed())
            System.out.println("TEST PASSED -> Home, Received docs, My uploads, Invitations are DISAPPEAR");
        else
            System.out.println("TEST FAILED -> Home, Received docs, My uploads, Invitations are NOT DISAPPEAR!");
        driver.quit();


    }
}
