package com.extractionproblems.extract.dates;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatesExtractor {
    //Method to extract all dates from a text
    public static List<String> extractDates(String text) {

        //Creating regex
        Pattern pattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}\\b");

        //Creating Matcher
        Matcher matcher = pattern.matcher(text);

        //Creating a list to store dates
        List<String> dates = new ArrayList<>();

        //Extracting dates and add them to list
        while(matcher.find()) {

            dates.add(matcher.group());
        }

        //Returning the valid dates
        return dates;
    }
    //Main method
    public static void main(String[] args) {

        //Creating a variable text
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        //Extracting dates form text
        List<String> dates = extractDates(text);

        //Printing the dates
        System.out.println("Dates are.....");
        for(String date: dates) {
            System.out.println(date);
        }
    }
}
