package com.stringoperations.replace.multiplespacetosinglespace;

public class SpaceTrimmer {
    //Method to replace multiple spaces with single space
    public static String replaceSpaces(String text) {

        //Replacing multiple spaces with single space
        text = text.replaceAll(" +"," ");
        return text;
    }
    //Main method
        public static void main(String[] args) {

        //Creating text
        String text = "This   is an example with multiple spaces.";

        //Printing the original text
        System.out.println("Original text: " + text);

        //Replacing multiple spaces with single space
        System.out.println("\nReplacing multiple spaces with single space......\n");
        text = replaceSpaces(text);

        //Printing the text
        System.out.println("Result text: " + text);
    }
}
