package com.annotation.deprecatedannotation;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();

        // Calling deprecated method - will show a warning
        legacyAPI.oldFeature();

        // Calling new method
        legacyAPI.newFeature();
    }
}
