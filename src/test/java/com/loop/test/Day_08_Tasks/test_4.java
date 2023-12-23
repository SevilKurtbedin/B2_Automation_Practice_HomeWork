package com.loop.test.Day_08_Tasks;

import com.loop.test.utilities.Automation;
import com.loop.test.utilities.Test_base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_4 extends Test_base {
    @Test (priority = 1)
    public void test_1() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Airi Satou", "Accountant", "Tokyo", "33", "11/27/2008"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//preceding-sibling::tr[1][@class='odd']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 2)
    public void test_2() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Angelica Ramos", "Chief Executive Officer (CEO)", "London", "47", "10/8/2009"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//preceding-sibling::tr[1][@class='even']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 3)
    public void test_3() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Ashton Cox", "Junior Technical Author", "San Francisco", "66", "1/11/2009"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[2][@class='odd']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 4)
    public void test_4() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Bradley Greer", "Software Engineer", "London", "41", "10/12/2012"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[2][@class='even']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 5)
    public void test_5() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Brenden Wagner", "Software Engineer", "San Francisco", "28", "6/6/2011"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[3][@class='odd']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 6)
    public void test_6() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Brielle Williamson", "Integration Specialist", "New York", "61", "12/1/2012"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[5][@class='even']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 7)
    public void test_7() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Bruno Nash", "Software Engineer", "London", "38", "5/2/2011"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[5][@class='odd']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 8)
    public void test_8() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Caesar Vance", "Pre-Sales Support", "New York", "21", "12/11/2011"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[7][@class='even']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 9)
    public void test_9() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Cara Stevens", "Sales Assistant", "New York", "46", "12/5/2011"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[7][@class='odd']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
    @Test (priority = 10)
    public void test_10() {
        driver.get(Automation.DATA_TABLES);
        List<String> listOfActualResults = new ArrayList<>();
        List<String> listOfExpectedResults = new ArrayList<>(Arrays.asList("Cedric Kelly", "Senior Javascript Developer", "Edinburgh", "22", "3/28/2012"));
        String xPath = "";
        WebElement element;
        for (int i = 1; i <= listOfExpectedResults.size(); i++) {
            xPath = "//table[@id='example']//following-sibling::tr[9][@class='even']//td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            listOfActualResults.add(element.getText());
            if (!listOfActualResults.isEmpty()) {
                actual = listOfActualResults.get(i - 1);
                expected = listOfExpectedResults.get(i - 1);
                Assert.assertEquals(actual, expected);
            }
        }
    }
}
