package com.filehandling.buffercopy;

import java.io.*;

public class BufferedFileCopy {

    // Method to copy a file using FileInputStream and FileOutputStream (unbuffered)
    public void copyWithFileStreams(String sourceFile, String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Creating FileInputStream and FileOutputStream
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            // Creating a buffer to read and write data
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            // Measuring start time
            long startTime = System.nanoTime();

            // Reading and writing data in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // Measuring end time and displaying execution time
            long endTime = System.nanoTime();
            System.out.println("Unbuffered copy completed in " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Failed to close streams: " + e.getMessage());
            }
        }
    }

    // Method to copy a file using BufferedInputStream and BufferedOutputStream (buffered)
    public void copyWithBufferedStreams(String sourceFile, String destinationFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // Creating BufferedInputStream and BufferedOutputStream
            bis = new BufferedInputStream(new FileInputStream(sourceFile));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFile));

            // Creating a buffer to read and write data
            byte[] buffer = new byte[4096]; // 4 KB buffer
            int bytesRead;

            // Measuring start time
            long startTime = System.nanoTime();

            // Reading and writing data in chunks
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Measuring end time and displaying execution time
            long endTime = System.nanoTime();
            System.out.println("Buffered copy completed in " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                System.out.println("Failed to close streams: " + e.getMessage());
            }
        }
    }
}
