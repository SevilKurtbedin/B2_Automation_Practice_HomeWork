package com.loop.test.Day_08_Tasks;

import com.loop.test.utilities.Automation;
import com.loop.test.utilities.Test_base;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class test_3 extends Test_base {
    @Test (priority = 1)
    public void test_1() {
        driver.get(Automation.PRACTICE_EXPAND_TESTING);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='table1']//following-sibling::tr[1]//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText().trim());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }
    }
    @Test (priority = 2)
    public void test_2() {
        driver.get(Automation.PRACTICE_EXPAND_TESTING);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Bach", "Frank", "fbach@yahoo.com", "$51.00", "http://www.frank.com"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='table1']//following-sibling::tr[2]//td[" + i + "]"; // here "following-sibling::tr[2]" - means that we will move to the second column
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText().trim());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }
    }
    @Test (priority = 3)
    public void test_3() {
        driver.get(Automation.PRACTICE_EXPAND_TESTING);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Doe", "Jason", "jdoe@hotmail.com", "$100.00", "http://www.jdoe.com"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='table1']//following-sibling::tr[3]//td[" + i + "]"; // here "following-sibling::tr[3]" - means that we will move to the third column
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText().trim());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }
    }
    @Test (priority = 4)
    public void test_4() {
        driver.get(Automation.PRACTICE_EXPAND_TESTING);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Conway", "Tim", "tconway@earthlink.net", "$50.00", "http://www.timconway.com"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='table1']//following-sibling::tr[4]//td[" + i + "]"; // here "following-sibling::tr[4]" - means that we will move to the fourth column
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText().trim());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }
    }
}
