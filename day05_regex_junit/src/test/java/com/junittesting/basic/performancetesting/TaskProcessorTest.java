package com.junittesting.basic.performancetesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskProcessorTest {

    private final TaskProcessor taskProcessor = new TaskProcessor();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fail if execution > 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = taskProcessor.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
