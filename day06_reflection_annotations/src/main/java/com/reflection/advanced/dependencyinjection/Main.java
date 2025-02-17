package com.reflection.advanced.dependencyinjection;


public class Main {
    public static void main(String[] args) throws Exception {
        UserService userService = DIContainer.createInstance(UserService.class);
        userService.useDatabase();
    }
}
