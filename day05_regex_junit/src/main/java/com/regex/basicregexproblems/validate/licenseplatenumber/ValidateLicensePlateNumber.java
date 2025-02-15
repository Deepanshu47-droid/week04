package com.basicregexproblems.validate.licenseplatenumber;
import java.util.regex.*;

public class ValidateLicensePlateNumber {
    //Method to check whether the licence plate number is valid or not
    public static boolean isValidLicensePlateNumber(String licensePlateNumber) {
        //Creating regex
        String regex = "^[A-Z]{2}[\\d]{4}$";
        Pattern pattern = Pattern.compile(regex);

        //Creating matcher object
        Matcher matcher = pattern.matcher(licensePlateNumber);

        return matcher.matches();
    }
    public static void main(String[] args) {

        //Creating a array of strings to store license plate number
        String[] licensePlateNumbers = {"FF4500", "ff4500", "123AF", "FSfs878", "F#hfd_sj", "AA8977", "FA9343"};

        //Iterating through each plate number and printing only valid plate numbers
        System.out.println("Valid license plate numbers are......");
        for(String licensePlateNumber : licensePlateNumbers) {

            //Printing the results
            if(isValidLicensePlateNumber(licensePlateNumber)) {
                System.out.println(licensePlateNumber + " is valid license plate number.");
            } else {
                System.out.println(licensePlateNumber + " is invalid license plate number.");
            }
        }

    }
}
