package com.annotation.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define custom annotation @TaskInfo
@Retention(RetentionPolicy.RUNTIME)  // Retention policy is RUNTIME to access at runtime
@Target(ElementType.METHOD)  // Target the annotation to methods
public @interface TaskInfo {
    String priority();  // Priority of the task
    String assignedTo();  // Person assigned to the task
}
