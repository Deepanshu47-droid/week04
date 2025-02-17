package com.reflection.basic.privatefieldaccess;

public class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Public method to get age
    public int getAge() {
        return age;
    }
}
