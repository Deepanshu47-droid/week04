package com.junittesting.basic.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})  // Passing multiple values
    void testIsEvenWithEvenNumbers(int number) {
        assertTrue(EvenNumberChecker.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})  // Passing odd numbers
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(EvenNumberChecker.isEven(number), number + " should be odd");
    }
}
