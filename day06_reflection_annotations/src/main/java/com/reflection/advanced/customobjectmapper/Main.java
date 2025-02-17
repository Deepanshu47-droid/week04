package com.reflection.advanced.customobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a map with property values
        Map<String, Object> personData = new HashMap<>();
        personData.put("name", "Deepanshu");
        personData.put("age", 23);

        // Converting map to object
        Person person = CustomObjectMapper.toObject(Person.class, personData);

        // Printing the mapped values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
