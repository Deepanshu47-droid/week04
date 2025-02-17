package com.annotation.loggingmethodexecution;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime for reflection
@Target(ElementType.METHOD)  // Can be applied to methods only
public @interface LogExecutionTime {
}
