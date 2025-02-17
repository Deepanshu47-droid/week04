package com.annotation.repeatableannotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            // Getting the method where @BugReport is applied
            Method method = SoftwareModule.class.getMethod("processData");

            // Checking if the method has multiple @BugReport annotations
            if (method.isAnnotationPresent(BugReports.class)) {
                // Retrieving the container annotation
                BugReports bugReports = method.getAnnotation(BugReports.class);

                // Printing all bug reports
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug Description: " + bugReport.description());
                    System.out.println("Reported By: " + bugReport.reportedBy());
                    System.out.println("----------------------");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

