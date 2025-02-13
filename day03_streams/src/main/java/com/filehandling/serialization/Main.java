package com.filehandling.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creating a list of employees with sample data
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Raj", "IT", 60000));
        employeeList.add(new Employee(2, "Gagan", "HR", 55000));
        employeeList.add(new Employee(3, "Shubham", "Finance", 50000));

        // File name for storing serialized data
        String fileName = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\serialization\\employees.ser";

        // Serializing the employee list to a file
        serializeEmployeeList(employeeList, fileName);

        // Deserializing the employee list from the file
        List<Employee> deserializedList = deserializeEmployeeList(fileName);

        // Displaying the deserialized employee list
        System.out.println("Deserialized Employee List:");
        for (Employee employee : deserializedList) {
            System.out.println(employee);
        }
    }

    // Method to serialize the list of employees
    private static void serializeEmployeeList(List<Employee> employeeList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Writing the employee list to the file
            oos.writeObject(employeeList);
            System.out.println("Employee list has been serialized to " + fileName);
        } catch (IOException e) {
            // Handling IOException during serialization
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize the list of employees from the file
    private static List<Employee> deserializeEmployeeList(String fileName) {
        List<Employee> employeeList = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // Reading the employee list from the file
            employeeList = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Handling IOException and ClassNotFoundException during deserialization
            System.out.println("Error during deserialization: " + e.getMessage());
        }
        return employeeList;
    }
}
