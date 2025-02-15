package com.junittesting.basic.stringutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
        assertEquals("avaJ", stringUtils.reverse("Java"));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("Racecar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome("Java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("JAVA", stringUtils.toUpperCase("Java"));
        assertEquals("", stringUtils.toUpperCase(""));
    }

    @Test
    void testReverseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.reverse(null);
        });
        assertEquals("Input string cannot be null", exception.getMessage());
    }

    @Test
    void testIsPalindromeWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.isPalindrome(null);
        });
        assertEquals("Input string cannot be null", exception.getMessage());
    }

    @Test
    void testToUpperCaseWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            stringUtils.toUpperCase(null);
        });
        assertEquals("Input string cannot be null", exception.getMessage());
    }
}
