package com.advancedproblems.Repeatingword;

import java.util.regex.*;
import java.util.HashSet;

public class RepeatedWordFinder {

    // Method to find repeating words in a sentence
    public static void findRepeatingWords(String text) {
        // Regex pattern to match words (case-insensitive)
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatingWords = new HashSet<>();

        // Finding and storing repeating words
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Printing the repeating words
        System.out.println("Repeating words: " + repeatingWords);
    }

    public static void main(String[] args) {
        // Example input sentence
        String text = "This is is a repeated repeated word test.";

        // Finding and printing repeating words
        findRepeatingWords(text);
    }
}
