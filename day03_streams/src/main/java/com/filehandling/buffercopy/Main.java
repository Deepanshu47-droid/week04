package com.filehandling.buffercopy;

import com.filehandling.buffercopy.BufferedFileCopy;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of BufferedFileCopy
        BufferedFileCopy fileCopy = new BufferedFileCopy();

        // Specifying the source and destination file paths
        String sourceFile = "src\\main\\java\\com\\filehandling\\buffercopy\\largefile.txt";
        String destinationFile1 = "src\\main\\java\\com\\filehandling\\buffercopy\\destination_unbuffered.txt";
        String destinationFile2 = "src\\main\\java\\com\\filehandling\\buffercopy\\destination_buffered.txt";

        // Copying file using unbuffered streams and measuring time
        System.out.println("Copying using unbuffered streams...");
        fileCopy.copyWithFileStreams(sourceFile, destinationFile1);

        // Copying file using buffered streams and measuring time
        System.out.println("Copying using buffered streams...");
        fileCopy.copyWithBufferedStreams(sourceFile, destinationFile2);
    }
}
