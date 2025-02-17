package com.reflection.advanced.customloggingproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Creating the real object
        Greeting greeting = new GreetingImpl();

        // Creating a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(greeting)
        );

        // Calling method via proxy
        proxyInstance.sayHello();
    }
}
