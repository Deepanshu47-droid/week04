package com.annotation.rolebasedaccesscontrol;
import java.lang.reflect.Method;

public class AccessControl {
    public static void invokeMethod(User user, Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            // Check if method has @RoleAllowed annotation
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                // Verify user role
                if (user.getRole().equals(roleAllowed.value())) {
                    method.invoke(obj); // Execute method if role matches
                } else {
                    System.out.println("Access Denied! " + user.getRole() + " cannot access " + methodName);
                }
            } else {
                method.invoke(obj); // Execute if no restriction
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
