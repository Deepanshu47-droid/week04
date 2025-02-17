package com.annotation.deprecatedannotation;

// Defining the class LegacyAPI
public class LegacyAPI {

    // Marking oldFeature() method as deprecated
    @Deprecated
    public void oldFeature() {

        System.out.println("This is the old feature. It is deprecated.");
    }

    // New recommended method
    public void newFeature() {

        System.out.println("This is the new feature.");
    }
}
