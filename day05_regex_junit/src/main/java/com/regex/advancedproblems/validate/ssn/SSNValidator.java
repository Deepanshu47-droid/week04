package com.advancedproblems.validate.ssn;
import java.util.regex.*;

public class SSNValidator {

    // Method to check whether the SSN is valid or not
    public static boolean isValidSSN(String ssn) {
        // Regex pattern for SSN (###-##-#### format)
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        return matcher.matches();
    }

    public static void main(String[] args) {
        // Sample SSNs for validation
        String[] ssns = {"123-45-6789", "123456789", "987-65-4321", "12-345-6789", "000-00-0000"};

        // Checking each SSN and printing validation results
        System.out.println("SSN Validation Results:");
        for (String ssn : ssns) {
            if (isValidSSN(ssn)) {
                System.out.println("Valid ssn: " + ssn);
            } else {
                System.out.println("Invalid ssn: " + ssn);
            }
        }
    }
}
