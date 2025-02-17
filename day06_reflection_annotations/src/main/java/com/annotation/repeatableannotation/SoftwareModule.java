package com.annotation.repeatableannotation;
public class SoftwareModule {

    // Applying multiple @BugReport annotations
    @BugReport(description = "NullPointerException occurs on invalid input", reportedBy = "deepanshu")
    @BugReport(description = "Performance issue when processing large data", reportedBy = "shubham")
    public void processData() {
        System.out.println("Processing data...");
    }
}
