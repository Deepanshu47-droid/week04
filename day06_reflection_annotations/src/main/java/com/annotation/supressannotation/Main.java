package com.annotation.supressannotation;
import java.util.ArrayList;

public class Main {

    // Suppressing unchecked warnings for the use of raw type ArrayList
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Creating an ArrayList without generics (raw type)
        ArrayList list = new ArrayList();

        // Adding different types of elements to the list
        list.add("Hello");
        list.add(123);
        list.add(45.67);

        // Printing the list
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
