package com.annotation.rolebasedaccesscontrol;

public class SecureService {

    @RoleAllowed("ADMIN") // Only ADMIN can access
    public void adminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER") // Only USER can access
    public void userTask() {
        System.out.println("User task executed successfully!");
    }
}
