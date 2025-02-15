package com.basicregexproblems.validate.hexcolor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColor {
    //Method to check whether the hex color is valid or not
    public static boolean isValidHexColor(String hexColor) {
        //Creating regex
        String regex = "^[#][\\dA-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        //Creating matcher object
        Matcher matcher = pattern.matcher(hexColor);

        return matcher.matches();
    }
    public static void main(String[] args) {

        //Creating a array of strings to store hex color
        String[] hexColors = {"#FFA500", "#ff4500", "#123", "hdfs878", "F#hfd_sj", "#FAA8977", "#FAA343"};

        //Iterating through each hex color and printing only valid hex colors
        System.out.println("Valid hex colors are......");
        for(String hexColor : hexColors) {

            //Printing the results
            if(isValidHexColor(hexColor)) {
                System.out.println(hexColor + " is valid hex color.");
            } else {
                System.out.println(hexColor + " is invalid hex color.");
            }
        }

    }
}
