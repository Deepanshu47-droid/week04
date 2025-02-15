package com.extractionproblems.extract.capitalizedwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {
    //Method to extract all capitalized words from a text
    public static List<String> extractCapitalizedWords(String text) {

        //Creating regex
        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");

        //Creating Matcher
        Matcher matcher = pattern.matcher(text);

        //Creating a list to store Capitalized words
        List<String> words = new ArrayList<>();

        //Extracting Capitalized words and add them to list
        while(matcher.find()) {

            words.add(matcher.group());
        }

        //Returning the valid emails
        return words;
    }
    //Main method
    public static void main(String[] args) {

        //Creating a variable text
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        //Extracting capitalized words form text
        List<String> words = extractCapitalizedWords(text);

        //Printing the email addresses
        System.out.println("Capitalized Words are.....");
        for(String word: words) {
            System.out.println(word);
        }
    }
}
