package com.regex.advancedproblems.extract.programminglanguage;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ProgrammingLanguageExtraction {

    // Method to extract programming languages from text
    public static List<String> extractLanguages(String text) {
        // List of common programming languages
        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C|C#|Ruby|Swift|Go|Kotlin|PHP|TypeScript|Rust)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();

        while (matcher.find()) {
            languages.add(matcher.group());
        }

        return languages;
    }

    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Extracting languages
        List<String> extractedLanguages = extractLanguages(text);

        // Printing results
        System.out.println("Extracted Programming Languages: " + extractedLanguages);
    }
}
