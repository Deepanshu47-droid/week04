package com.annotation.fieldvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime for reflection
@Target(ElementType.FIELD)  // Can be applied to fields only
public @interface MaxLength {
    int value(); // Maximum allowed length
}
