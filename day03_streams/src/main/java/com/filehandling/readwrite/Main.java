package com.filehandling.readwrite;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of FileHandler
        FileHandler fileHandler = new FileHandler();

        // Specifying the source and destination file paths
        String sourceFile = "src\\main\\java\\com\\filehandling\\readwrite\\source.txt";
        String destinationFile = "src\\main\\java\\com\\filehandling\\readwrite\\destination.txt";

        // Calling the copyFile method to copy the file
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}
