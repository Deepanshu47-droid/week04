package com.reflection.advanced.jsonrepresentation;
import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        if (obj == null) {
            return "null";
        }

        StringBuilder jsonBuilder = new StringBuilder("{");

        // Getting class fields
        Field[] fields = obj.getClass().getDeclaredFields();
        int count = 0;

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                String name = field.getName();
                Object value = field.get(obj);

                jsonBuilder.append("\"").append(name).append("\":");

                if (value instanceof String) {
                    jsonBuilder.append("\"").append(value).append("\"");
                } else {
                    jsonBuilder.append(value);
                }

                count++;
                if (count < fields.length) {
                    jsonBuilder.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
