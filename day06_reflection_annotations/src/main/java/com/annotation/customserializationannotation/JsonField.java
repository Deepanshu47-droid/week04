package com.annotation.customserializationannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation for JSON field mapping
@Target(ElementType.FIELD) // Apply to fields
@Retention(RetentionPolicy.RUNTIME) // Retain during runtime for reflection
public @interface JsonField {
    String name(); // Custom name for JSON field
}
