package com.annotation.fieldvalidation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10) // Restricting username to 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    private void validateMaxLength(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            // Checking if @MaxLength annotation is present
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (value.length() > maxLength.value()) {
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength.value() + " characters.");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
