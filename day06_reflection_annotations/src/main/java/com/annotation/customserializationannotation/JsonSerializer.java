package com.annotation.customserializationannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    // Method to convert an object to JSON string
    public static String toJson(Object object) {
        Map<String, String> jsonFields = new HashMap<>();

        // Use reflection to get fields of the object
        for (Field field : object.getClass().getDeclaredFields()) {
            // Check if the field is annotated with @JsonField
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jsonField = field.getAnnotation(JsonField.class);

                // Set the field accessible in case it's private
                field.setAccessible(true);

                try {
                    // Add the field value to the map with the custom JSON key
                    jsonFields.put(jsonField.name(), field.get(object).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Build JSON-like string from the map
        StringBuilder jsonBuilder = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonFields.entrySet()) {
            jsonBuilder.append("\"").append(entry.getKey()).append("\": \"").append(entry.getValue()).append("\", ");
        }

        // Remove the trailing comma and space, then close the JSON object
        if (!jsonFields.isEmpty()) {
            jsonBuilder.setLength(jsonBuilder.length() - 2);
        }
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

}
