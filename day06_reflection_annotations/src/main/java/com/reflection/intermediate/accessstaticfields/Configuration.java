package com.reflection.intermediate.accessstaticfields;

class Configuration {
    // Private static field
    private static String API_KEY = "ORIGINAL_KEY";

    // Method to retrieve the API_KEY (for verification)
    public static String getApiKey() {
        return API_KEY;
    }
}
