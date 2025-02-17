package com.reflection.intermediate.retrieveannotation;

public class Main {
    public static void main(String[] args) {
        // Getting the class object
        Class<MyClass> obj = MyClass.class;

        // Checking if @Author annotation is present
        if (obj.isAnnotationPresent(Author.class)) {
            // Retrieving the annotation
            Author author = obj.getAnnotation(Author.class);
            // Displaying annotation value
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No @Author annotation present.");
        }
    }
}
