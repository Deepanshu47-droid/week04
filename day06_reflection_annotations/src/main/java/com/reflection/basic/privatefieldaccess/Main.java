package com.reflection.basic.privatefieldaccess;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a Person object
            Person person = new Person(25);

            // Getting the Class object
            Class<?> personClass = person.getClass();

            // Accessing the private field 'age'
            Field ageField = personClass.getDeclaredField("age");

            // Making the private field accessible
            ageField.setAccessible(true);

            // Retrieving the current value of 'age'
            int currentAge = (int) ageField.get(person);
            System.out.println("Before modification: Age = " + currentAge);

            // Modifying the private field 'age'
            ageField.set(person, 30);

            // Retrieving the modified value
            int modifiedAge = (int) ageField.get(person);
            System.out.println("After modification: Age = " + modifiedAge);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
