package com.annotation.rolebasedaccesscontrol;

public class Main {
    public static void main(String[] args) {
        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");

        SecureService service = new SecureService();

        // Testing with different users
        System.out.println("Admin trying to access adminTask:");
        AccessControl.invokeMethod(adminUser, service, "adminTask");

        System.out.println("\nUser trying to access adminTask:");
        AccessControl.invokeMethod(normalUser, service, "adminTask");

        System.out.println("\nUser trying to access userTask:");
        AccessControl.invokeMethod(normalUser, service, "userTask");
    }
}
