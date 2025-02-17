package com.reflection.advanced.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Creating a new instance of the class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterating through map entries and set fields
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Field not found: " + fieldName);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating object", e);
        }
    }
}
