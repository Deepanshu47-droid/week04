package com.annotation.repeatableannotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define the repeatable annotation @BugReport
@Repeatable(BugReports.class) // Marking as repeatable
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)  // Can be applied to methods
public @interface BugReport {
    String description();  // Description of the bug
    String reportedBy();   // Name of the person reporting
}
