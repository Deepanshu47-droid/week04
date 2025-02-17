package com.annotation.customcachingsystem;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation for caching method results
@Target(ElementType.METHOD)  // Apply to methods
@Retention(RetentionPolicy.RUNTIME) // Retain during runtime for reflection
public @interface CacheResult {
}
