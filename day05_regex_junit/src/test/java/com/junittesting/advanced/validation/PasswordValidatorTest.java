package com.junittesting.advanced.validation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("StrongP@ss1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("Abc1"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(PasswordValidator.isValidPassword("weakpassword1"));
    }

    @Test
    void testNoDigit() {
        assertFalse(PasswordValidator.isValidPassword("NoDigitPass"));
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValidPassword(""));
    }
}
