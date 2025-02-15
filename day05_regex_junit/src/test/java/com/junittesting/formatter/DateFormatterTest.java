package com.junittesting.advanced.formatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDateFormat() {
        assertEquals("25-12-2023", DateFormatter.formatDate("2023-12-25"));
        assertEquals("01-01-2024", DateFormatter.formatDate("2024-01-01"));
        assertEquals("15-08-2020", DateFormatter.formatDate("2020-08-15"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("12-25-2023"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("25-12-2023"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("2023/12/25"));
        assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("InvalidDate"));
    }
}
