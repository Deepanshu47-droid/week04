package com.junittesting.basic.exceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    private final Division div = new Division();

    @Test
    void testDivideWithValidNumbers() {
        assertEquals(5, div.divide(10, 2));
        assertEquals(-3, div.divide(-9, 3));
        assertEquals(0, div.divide(0, 5));
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            div.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
