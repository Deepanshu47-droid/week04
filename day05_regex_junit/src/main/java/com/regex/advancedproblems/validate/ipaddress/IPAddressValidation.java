package com.advancedproblems.validate.ipaddress;

import java.util.regex.Pattern;

public class IPAddressValidation {

    // Regular expression for a valid IPv4 address
    private static final String IPV4_REGEX =
            "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                    + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                    + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                    + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

    // Method to validate an IPv4 address
    public static boolean isValidIPv4(String ipAddress) {
        return Pattern.matches(IPV4_REGEX, ipAddress);
    }

    public static void main(String[] args) {
        // Test cases
        String[] ipAddresses = {
                "192.168.1.1",
                "255.255.255.255",
                "0.0.0.0",
                "256.100.50.25",
                "192.168.1.999",
                "10.0.0.1.5",
                "172.16.254.1"
        };

        // Validate and print results
        System.out.println("IPv4 Address Validation Results:");
        for (String ip : ipAddresses) {
            System.out.println(ip + " → " + (isValidIPv4(ip) ? "Valid" : "Invalid"));
        }
    }
}
