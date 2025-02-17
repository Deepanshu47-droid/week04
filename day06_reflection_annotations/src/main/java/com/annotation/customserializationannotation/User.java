package com.annotation.customserializationannotation;

public class User {
    @JsonField(name = "user_name") // Custom JSON field name
    private String username;

    @JsonField(name = "user_age") // Custom JSON field name
    private int age;

    // Constructor
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
