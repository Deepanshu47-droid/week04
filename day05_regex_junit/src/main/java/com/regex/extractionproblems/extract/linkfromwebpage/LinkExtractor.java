package com.extractionproblems.extract.linkfromwebpage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {
    //Method to extract all links from a text
    public static List<String> extractLinks(String text) {

        //Creating regex
        Pattern pattern = Pattern.compile("\\b(https?:\\/\\/)?(www\\.)?[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+([\\/\\w.-]*)*\\/?\\b");

        //Creating Matcher
        Matcher matcher = pattern.matcher(text);

        //Creating a list to store links
        List<String> links = new ArrayList<>();

        //Extracting links and adding them to list
        while(matcher.find()) {

            links.add(matcher.group());
        }

        //Returning the valid dates
        return links;
    }
    //Main method
    public static void main(String[] args) {

        //Creating a variable text
        String text = "Visit https://www.google.com and http://example.org for more info.";

        //Extracting links form text
        List<String> links = extractLinks(text);

        //Printing the links
        System.out.println("Links are.....");
        for(String link: links) {
            System.out.println(link);
        }
    }
}
