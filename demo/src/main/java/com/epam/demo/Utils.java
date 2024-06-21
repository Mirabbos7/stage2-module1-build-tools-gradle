package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("-11.1");
        System.out.println(isAllPositiveNumbers(list));
    }
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s : args) {
            try {
                double number = Double.parseDouble(s);
                if (number <= 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}