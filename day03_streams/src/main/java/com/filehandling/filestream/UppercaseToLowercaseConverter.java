package com.filehandling.filestream;

import java.io.*;

public class UppercaseToLowercaseConverter {

    public static void main(String[] args) {

        // Defining the source and destination file paths
        String sourceFile = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\filestream\\source.txt";
        String destinationFile = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\filestream\\destination.txt";

        // Converting all uppercase letters in the source file to lowercase and writing to the destination file
        convertUppercaseToLowercase(sourceFile, destinationFile);
    }

    // Method for converting uppercase letters to lowercase and writing to a new file
    private static void convertUppercaseToLowercase(String sourceFile, String destinationFile) {
        // Creating FileReader and BufferedReader to read from the source file
                try (FileReader fr = new FileReader(sourceFile);
                    BufferedReader br = new BufferedReader(fr);
                     // Creating FileWriter and BufferedWriter to write to the destination file
                     FileWriter fw = new FileWriter(destinationFile);
                     BufferedWriter bw = new BufferedWriter(fw)) {

            // Reading the source file line by line
            String line;
            while ((line = br.readLine()) != null) {
                // Converting the line to lowercase
                line = line.toLowerCase();

                // Writing the lowercase line to the destination file
                bw.write(line);
                bw.newLine();
            }

            // Printing success message
            System.out.println("Successfully converted uppercase to lowercase and written to " + destinationFile);

        } catch (IOException e) {
            // Handling IOException
            System.out.println("Error during file processing: " + e.getMessage());
        }
    }
}
