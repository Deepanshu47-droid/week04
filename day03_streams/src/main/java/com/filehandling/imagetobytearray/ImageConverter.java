package com.filehandling.imagetobytearray;

import java.io.*;

public class ImageConverter {

    public static void main(String[] args) {

        // Defining the source and destination file paths
        String sourceImage = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\imagetobytearray\\original_image.jpg";
        String destinationImage = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\imagetobytearray\\copied_image.jpg";

        // Converting the image file to a byte array
        byte[] imageData = convertImageToByteArray(sourceImage);

        // Checking if the byte array is not null
        if (imageData != null) {
            // Writing the byte array back to a new image file
            writeByteArrayToImage(imageData, destinationImage);
        }
    }

    // Method for converting an image file to a byte array
    private static byte[] convertImageToByteArray(String filePath) {

        // Creating a FileInputStream to read the image file
        // Creating a ByteArrayOutputStream to store the byte array
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            // Reading the image file in chunks and writing to ByteArrayOutputStream
            byte[] buffer = new byte[4096];  // Buffer size of 4 KB
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            // Returning the byte array
            System.out.println("Image successfully converted to byte array.");
            return baos.toByteArray();
        } catch (IOException e) {
            // Handling IOException
            System.out.println("Error while converting image to byte array: " + e.getMessage());
            return null;
        }
    }

    // Method for writing a byte array back to an image file
    private static void writeByteArrayToImage(byte[] imageData, String filePath) {

        // Creating a ByteArrayInputStream from the byte array
        // Creating a FileOutputStream to write the new image file
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            // Reading from ByteArrayInputStream and writing to the new image file
            byte[] buffer = new byte[4096];  // Buffer size of 4 KB
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // Printing success message
            System.out.println("Byte array successfully written to " + filePath);
        } catch (IOException e) {
            // Handling IOException during writing
            System.out.println("Error while writing byte array to image: " + e.getMessage());
        }
    }
}
