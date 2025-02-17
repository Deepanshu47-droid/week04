package com.reflection.advanced.dependencyinjection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

// Creating a simple Dependency Injection container
public class DIContainer {
    public static <T> T createInstance(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        T instance = constructor.newInstance();

        // Injecting dependencies
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(instance, dependency);
            }
        }
        return instance;
    }
}
