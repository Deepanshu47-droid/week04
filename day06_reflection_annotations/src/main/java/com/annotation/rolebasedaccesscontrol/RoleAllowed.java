package com.annotation.rolebasedaccesscontrol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Define @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)  // Retain at runtime for reflection
@Target(ElementType.METHOD)  // Apply only to methods
public @interface RoleAllowed {
    String value(); // Role required to access the method
}
