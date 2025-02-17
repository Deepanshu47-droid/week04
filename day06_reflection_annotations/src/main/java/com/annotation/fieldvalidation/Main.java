package com.annotation.fieldvalidation;

public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("Deepanshu"); // Valid username
            System.out.println("User created with username: " + user1.getUsername());

            User user2 = new User("VeryLongUsername"); // Exceeds max length
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
