package com.regex.advancedproblems.extract.currencyvalues;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyValuesExtractor {

    // Method to extract currency values from text
    public static List<String> extractCurrencyValues(String text) {
        // Regex to match currency values (with or without '$' symbol)
        String regex = "\\$?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }

    public static void main(String[] args) {
        // Example text input
        String text = "The price is $45.99, and the discount is 10.50.";

        // Extracting currency values
        List<String> extractedValues = extractCurrencyValues(text);

        // Printing results
        System.out.println("Extracted Currency Values: " + extractedValues);
    }
}
