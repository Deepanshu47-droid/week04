package com.reflection.advanced.dependencyinjection;

// Defining a class that requires dependency injection
public class UserService {
    @Inject
    private DatabaseService databaseService;

    public void useDatabase() {
        databaseService.connect();
    }
}
