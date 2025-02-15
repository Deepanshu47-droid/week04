package com.junittesting.advanced.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!", UserRegistration.registerUser("Deepanshu", "deepanshu@mail.com", "Password1"));
        assertEquals("User registered successfully!", UserRegistration.registerUser("Raj", "raj.123@mail.com", "Test1234"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "user@mail.com", "Password1"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("  ", "user@mail.com", "Password1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Deepanshu", "deepanshu.mail.com", "Password1"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Deepanshu", "deepanshu@mail.com", "pass"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Raj", "raj@mail.com", "password"));
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Shubham", "shubham@mail.com", "PASSWORD"));
    }
}
