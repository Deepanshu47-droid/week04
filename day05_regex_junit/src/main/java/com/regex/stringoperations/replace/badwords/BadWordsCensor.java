package com.stringoperations.replace.badwords;

import java.util.List;

public class BadWordsCensor {
    //Method to Censor bad words
    public static String censorBadWords(String text, String[] badWords) {

        //Replacing bad words with ****
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****"); //"(?i)\\b" used to ignore case
        }
        return text;
    }
    //Main method
    public static void main(String[] args) {

        //Creating text and list of bad words
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid", "fuck"};

        //Printing the original text
        System.out.println("Original text: " + text);

        //Censoring bad words
        System.out.println("\nCensoring bad words......\n");
        text = censorBadWords(text, badWords);

        //Printing the text
        System.out.println("Result text: " + text);
    }
}
