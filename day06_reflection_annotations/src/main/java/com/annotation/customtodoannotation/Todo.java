package com.annotation.customtodoannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Defining the custom annotation @Todo
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime for reflection
@Target(ElementType.METHOD)  // Can be applied to methods
public @interface Todo {
    String task();  // Task description (mandatory)
    String assignedTo();  // Developer assigned (mandatory)
    String priority() default "MEDIUM";  // Optional, default is "MEDIUM"
}
