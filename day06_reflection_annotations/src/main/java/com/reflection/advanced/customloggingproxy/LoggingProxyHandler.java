package com.reflection.advanced.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Creating a Dynamic Proxy using InvocationHandler
public class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    // Initializing the real object
    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    // Intercepting method calls and logging method name
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Executing method: " + method.getName());
        return method.invoke(target, args);
    }
}
