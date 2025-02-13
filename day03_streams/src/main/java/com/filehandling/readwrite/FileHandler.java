package com.filehandling.readwrite;

import java.io.*;

public class FileHandler {

    // Method to read content from a source file and write it to a destination file
    public void copyFile(String sourceFile, String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Creating a File object for the source file
            File source = new File(sourceFile);

            // Checking if the source file exists
            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Initializing FileInputStream to read from the source file
            fis = new FileInputStream(source);

            // Initializing FileOutputStream to write to the destination file
            fos = new FileOutputStream(destinationFile);

            int bytesRead;

            // Reading data from the source file and writing it to the destination file
            while ((bytesRead = fis.read()) != -1) {
                fos.write(bytesRead);
            }

            // Displaying success message after writing to the destination file
            System.out.println("File copied successfully to " + destinationFile);
        } catch (IOException e) {
            // Handling any IOException that may occur
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                // Closing FileInputStream if it is not null
                if (fis != null) {
                    fis.close();
                }

                // Closing FileOutputStream if it is not null
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Failed to close streams: " + e.getMessage());
            }
        }
    }
}
