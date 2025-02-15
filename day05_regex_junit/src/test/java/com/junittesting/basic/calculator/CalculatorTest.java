package com.junittesting.basic.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(6, 4));
        assertEquals(0, calculator.add(-3, 3));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-3, calculator.subtract(2, 5));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-15, calculator.multiply(-3, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-4, calculator.divide(-8, 2));
        assertEquals(1, calculator.divide(5, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
