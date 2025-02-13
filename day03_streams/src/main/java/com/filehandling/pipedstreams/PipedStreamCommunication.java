package com.filehandling.pipedstreams;

import java.io.*;

public class PipedStreamCommunication {
    public static void main(String[] args) {
        // Creating piped input and output streams for communication between threads
        try (PipedOutputStream pos = new PipedOutputStream();
             PipedInputStream pis = new PipedInputStream(pos)) {

            // Creating and starting writer thread
            Thread writerThread = new Thread(new WriterTask(pos), "WriterThread");
            writerThread.start();

            // Creating and starting reader thread
            Thread readerThread = new Thread(new ReaderTask(pis), "ReaderThread");
            readerThread.start();

            // Joining threads to ensure the main thread waits for their completion
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            // Handling exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Writer task for writing data into the PipedOutputStream
class WriterTask implements Runnable {
    private PipedOutputStream pos;

    // Initializing the PipedOutputStream
    public WriterTask(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            // Writing data to the PipedOutputStream
            for (int i = 1; i <= 5; i++) {
                String message = "Message " + i;
                pos.write(message.getBytes());
                System.out.println("Writer: Sent - " + message);
                Thread.sleep(500);  // Simulating delay
            }
        } catch (IOException e) {
            // Handling exceptions
            System.out.println("Writer Error: " + e.getMessage());
        } catch ( InterruptedException e) {
            // Handling exceptions
            System.out.println("Writer Error: " + e.getMessage());
        } finally {
            try {
                pos.close();  // Closing the stream
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }
    }
}

// Reader task for reading data from the PipedInputStream
class ReaderTask implements Runnable {
    private PipedInputStream pis;

    // Initializing the PipedInputStream
    public ReaderTask(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            // Reading data from the PipedInputStream
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = pis.read(buffer)) != -1) {
                String message = new String(buffer, 0, bytesRead);
                System.out.println("Reader: Received - " + message);
            }
        } catch (IOException e) {
            // Handling exceptions
            System.out.println("Reader Error: " + e.getMessage());
        } finally {
            try {
                pis.close();  // Closing the stream
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
