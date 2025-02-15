package com.junittesting.basic.lifecycle;

public class DatabaseConnection {

    private boolean isConnected;

    // Simulating database connection
    public void connect() {
        isConnected = true;
        System.out.println("Database Connected");
    }

    // Simulating closing the connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database Disconnected");
    }

    // Check connection status
    public boolean isConnected() {
        return isConnected;
    }
}
