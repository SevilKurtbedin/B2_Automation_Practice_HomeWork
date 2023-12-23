package com.loop.test.utilities;

import org.openqa.selenium.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaOrderWebTable extends Test_base{
    public static List<String> useForLoopForOrder (WebDriver driver, String name) {
        List <String> listOfMyOrder = new ArrayList<>();
        WebElement element;
        String xPath = "";
        String actual = "";
        String expected = "";
        String [] expectedResult = {"Thin Crust", "2", "04/15/2021", "7, Miller Street", "Chicago, IL", "US", "748",
                "Visa", "321456789012", "02/24"}; // size is 9
        for (int i = 1; i <= 10; i++) { // started from 1, because in td[0] we don't have any text
            xPath = "//td[.='" + name + "']//following-sibling::td[" + i + "]";
            element = driver.findElement(By.xpath(xPath));
            if (element.isDisplayed()) {
                listOfMyOrder.add(element.getText().trim()); // size is also 9
            } if (!listOfMyOrder.isEmpty()) {
                actual = listOfMyOrder.get(i - 1); // i - 1, because we need started from 0, if we started from 1 we miss first text in our Array String
                expected = expectedResult[i - 1]; // same think
            }
            if (actual.equalsIgnoreCase(expected)) {
                System.out.println("Actual text: " + actual + " is equals to Expected text: " + expected + " -> TEST PASSED");
            } else {
                System.err.println("Actual text: " + actual + " is NOT equals to Expected text: " + expected + " -> TEST FAILED");
            }
        }
        return listOfMyOrder;
    }
    /*
    public static String pizzaField(WebDriver driver, String name, String field) {
        WebElement element = null;
        String index = "";
        String xPath = "";

        if (field.equalsIgnoreCase("Pizza Type")) {
            index = "[1]";
        } else if (field.equalsIgnoreCase("Amount")) {
            index = "[2]";
        } else if (field.equalsIgnoreCase("Date")) {
            index = "[3]";
        } else if (field.equalsIgnoreCase("Street")) {
            index = "[4]";
        } else if (field.equalsIgnoreCase("City")){
            index = "[5]";
        } else if (field.equalsIgnoreCase("State")) {
            index = "[6]";
        } else if (field.equalsIgnoreCase("Zip")) {
            index = "[7]";
        } else if (field.equalsIgnoreCase("Card")) {
            index = "[8]";
        } else if (field.equalsIgnoreCase("Card Number")) {
            index = "[9]";
        } else if (field.equalsIgnoreCase("Exp")) {
            index = "[10]";
        } else {
            System.out.println("There is not such a field: " + field);
        }
        return element.getText().trim();
    }
     */
}
    /*
    1. go to https://loopcamp.vercel.app/web-tables.html
    2. create a method to test given field for a given name
    3. test type
    4. test amount
    5. test date
    6. test street
    7. test city
    8. test state
    9. test zip
    10. test card
    11. test card number
    12. test exp
     */