package com.rasona.rasona.utils;

public class NumberUtils {

    public static String transformIfNotDouble(String input) {
        return input.replaceAll("\\.0+$", "");
    }
    public static String formatToTwoDecimalsIfDouble(String input) {
        double value = Double.parseDouble(input);
        return String.format("%.2f", value);
    }
    public static boolean isInteger(String input) {
        try {
            double parsedValue = Double.parseDouble(input);
            return parsedValue % 1 == 0 || input.matches("-?\\d+\\.0+");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String input) {
        try {
            return !isInteger(input);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
