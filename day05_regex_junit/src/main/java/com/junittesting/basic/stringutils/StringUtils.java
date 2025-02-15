package com.junittesting.basic.stringutils;

public class StringUtils {

    // Method to reverse a string
    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return str.toUpperCase();
    }
}
