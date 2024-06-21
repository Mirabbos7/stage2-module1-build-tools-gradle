package com.epam.utils;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isPositiveNumber("-12346"));
    }
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        try {
            return Integer.parseInt(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
