package com.annotation.overrideannotation;

// Defining the Dog class that extends Animal
public class Dog extends Animal {
    // Overriding makeSound() method from Animal class
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
