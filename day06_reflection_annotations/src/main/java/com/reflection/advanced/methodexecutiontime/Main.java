package com.reflection.advanced.methodexecutiontime;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskProcessor processor = new TaskProcessor();
        Method method = processor.getClass().getMethod("longRunningTask");

        long startTime = System.nanoTime();
        method.invoke(processor);
        long endTime = System.nanoTime();

        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
