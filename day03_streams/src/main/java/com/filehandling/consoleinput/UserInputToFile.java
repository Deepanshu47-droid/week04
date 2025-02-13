package com.filehandling.consoleinput;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Creating a BufferedReader to read input from the console
            reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading user's name
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Reading user's age
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            // Reading user's favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Creating a FileWriter to write user details into a file
            writer = new FileWriter("C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\consoleinput\\UserDetails.txt");
            writer.write("User Details:\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            // Confirmation message after writing to the file
            System.out.println("User details have been saved to UserDetails.txt");

        } catch (IOException e) {
            // Handling IOException
            System.out.println("An error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handling invalid age input
            System.out.println("Invalid input for age. Please enter a valid integer.");
        } finally {
            // Closing resources
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Failed to close resources: " + e.getMessage());
            }
        }
    }
}
