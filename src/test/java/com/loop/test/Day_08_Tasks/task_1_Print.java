package com.loop.test.Day_08_Tasks;

import com.loop.test.utilities.PizzaOrderWebTable;
import com.loop.test.utilities.Test_base;
import org.testng.annotations.Test;

public class task_1_Print extends Test_base {
    @Test
    public void test_pizza() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        actual = String.valueOf(PizzaOrderWebTable.useForLoopForOrder(driver, "Alexandra Gray"));
    }
}
