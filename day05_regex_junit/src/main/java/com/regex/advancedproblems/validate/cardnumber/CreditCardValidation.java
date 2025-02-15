package com.regex.advancedproblems.validate.cardnumber;

import java.util.regex.Pattern;

public class CreditCardValidation {

    // Regular expressions for Visa and MasterCard
    private static final String VISA_REGEX = "^4\\d{15}$";      // 4 followed by 15 digits
    private static final String MASTERCARD_REGEX = "^5\\d{15}$"; // 5 followed by 15 digits

    // Method to validate credit card numbers
    public static String validateCreditCard(String cardNumber) {
        if (Pattern.matches(VISA_REGEX, cardNumber)) {
            return "Valid Visa Card";
        } else if (Pattern.matches(MASTERCARD_REGEX, cardNumber)) {
            return "Valid MasterCard";
        } else {
            return "Invalid Card Number";
        }
    }

    public static void main(String[] args) {
        // Test cases
        String[] cardNumbers = {
                "4111111111111111",
                "5555555555554444",
                "4012888888881881",
                "5105105105105100",
                "1234567812345678",
                "444411112222",
                "5999999999999999"
        };

        // Validate and print results
        System.out.println("Credit Card Validation Results:");
        for (String card : cardNumbers) {
            System.out.println(card + " → " + validateCreditCard(card));
        }
    }
}
