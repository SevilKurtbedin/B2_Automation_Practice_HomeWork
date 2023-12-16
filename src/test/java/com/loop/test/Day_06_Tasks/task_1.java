package com.loop.test.Day_06_Tasks;

import com.loop.test.utilities.Test_base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task_1 extends Test_base {
    /*
    task1
=============
1. go to https://demoqa.com/alerts
2. click - click button to see alert
3. handle alert
4. click - On button click, alert will appear after 5 seconds
5. handle alert
6. click - On button click, confirm box will appear
7. click ok and validate - You selected Ok
8. after that do it again this time cancel and validate - You selected Cancel
9. click - On button click, prompt box will appear
10. enter "Loop Academy" and validate You entered Loop Academy
     */
    @Test
    public void test1() throws InterruptedException {

        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement timerAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        timerAlertButton.click();
        Thread.sleep(5000); // we need wait 5 sec because of alert will appear after 5 seconds
        alert.accept();

        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();
        alert.accept();

        WebElement validateMessage = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        actual = validateMessage.getText();
        System.out.println(actual); // -> You selected Ok
        expected = "You selected Ok";
        Assert.assertEquals(actual, expected);

        confirmButton.click();
        alert.dismiss();
        actual = validateMessage.getText();
        System.out.println(actual); // -> You selected Cansel
        expected = "You selected Cancel";
        Assert.assertEquals(actual, expected);

        WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promptButton.click();
        alert.sendKeys("Loop Academy");
        alert.accept();

        WebElement validateMessagePrompt = driver.findElement(By.xpath("//span[@id='promptResult']"));
        actual = validateMessagePrompt.getText();
        System.out.println(actual); // -> You entered Loop Academy
        expected = "You entered Loop Academy";
        Assert.assertEquals(actual, expected);
    }
}
