package com.filehandling.largefilereader;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        // Specifying the path of the large text file
        String filePath = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\largefilereader\\large.txt";

        // Reading the file line by line
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Checking if the line contains the word "error" (case insensitive)
                if (line.toLowerCase().contains("error")) {
                    // Printing the line containing "error"
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // Handling exceptions related to file operations
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
