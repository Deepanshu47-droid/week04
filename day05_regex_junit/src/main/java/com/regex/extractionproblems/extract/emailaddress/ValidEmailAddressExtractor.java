package com.extractionproblems.extract.emailaddress;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailAddressExtractor {
    //Method to extract all valid email addresses from a text
    public static List<String> extractEmailAddresses(String text) {

        //Creating regex
        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b");

        //Creating Matcher
        Matcher matcher = pattern.matcher(text);

        //Creating a list to store email addresses
        List<String> emails = new ArrayList<>();

        //Extracting valid emails and add them to list
        while(matcher.find()) {

            emails.add(matcher.group());
        }

        //Returning the valid emails
        return emails;
    }
    //Main method
    public static void main(String[] args) {

        //Creating a variable text
        String text = "Contact us at support@example.com and info@company.org";

        //Extracting email addresses form text
        List<String> emails = extractEmailAddresses(text);

        //Printing the email addresses
        System.out.println("Emails are.....");
        for(String email: emails) {
            System.out.println(email);
        }
    }
}
