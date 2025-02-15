package com.basicregexproblems.validate.username;
import java.util.regex.*;
public class ValidateUsername {

    //Method to check whether the username is valid or not
    public static boolean isValidUsername(String userName) {
        //Creating regex
        String regex = "^[a-zA-Z][a-zA-Z\\d_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        //Creating matcher object
        Matcher matcher = pattern.matcher(userName);

        return matcher.matches();


    }
    public static void main(String[] args) {

        //Creating a array of strings to store usernames
        String[] userNames = {"user_123", "Deep_66", "vinay89", "raJ__42", "870fjj", "_fkdsa89"};

        //Iterating through each username and printing only valid user names
        System.out.println("Valid user names are......");
        for(String userName : userNames) {

            //Printing the results
            if(isValidUsername(userName)) {
                System.out.println(userName + " is valid user name.");
            } else {
                System.out.println(userName + " is invalid user name.");
            }
        }

    }
}
