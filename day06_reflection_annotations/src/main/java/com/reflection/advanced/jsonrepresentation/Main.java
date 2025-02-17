package com.reflection.advanced.jsonrepresentation;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Deepanshu", 23, true);

        String json = JsonConverter.toJson(person);
        System.out.println(json);
    }
}