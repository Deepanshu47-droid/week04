package com.annotation.markimportantmethods;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Defining the custom annotation @ImportantMethod
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime for reflection
@Target(ElementType.METHOD)  // Can be applied to methods
public @interface ImportantMethod {
    String level() default "HIGH";  //parameter with default value "HIGH"
}
