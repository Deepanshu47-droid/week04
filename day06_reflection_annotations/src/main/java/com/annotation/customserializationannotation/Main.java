package com.annotation.customserializationannotation;

public class Main {
    public static void main(String[] args) {
        User user = new User("deepanshu", 30);

        // Serialize the User object to JSON string
        String json = JsonSerializer.toJson(user);
        System.out.println(json); // Expected output: {"user_name": "deepanshu", "user_age": "30"}
    }
}
