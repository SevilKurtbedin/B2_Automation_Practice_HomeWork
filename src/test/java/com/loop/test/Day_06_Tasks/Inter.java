package com.loop.test.Day_06_Tasks;

import java.util.*;

public class Inter {
    public static void main(String[] args) {
        String str = "Loop Academy";
        System.out.println(method("Loop Camp"));
    }
    public static Set <String> method (String str) {
        List <String> method1 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            method1.add("" + str.charAt(i));
        }
        Collections.sort(method1);
        Set <String> set = new HashSet<>();
        set.add(str);
        return set;
    }
}
