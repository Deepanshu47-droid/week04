package com.datastructures.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Class representing an employee
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class to group employees by their department
public class EmployeeGrouper {

    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        // Iterating through the list of employees
        for (Employee employee : employees) {
            String department = employee.getDepartment();

            // Adding employee to the corresponding department list
            departmentMap.computeIfAbsent(department, k -> new ArrayList<>()).add(employee);
        }

        return departmentMap;
    }

    // Main method to demonstrate grouping employees by department
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shubh", "HR"));
        employees.add(new Employee("Deepanshu", "IT"));
        employees.add(new Employee("Raj", "HR"));
        employees.add(new Employee("Gagan", "IT"));
        employees.add(new Employee("Shubham", "Finance"));

        // Grouping employees by their department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Displaying grouped employees
        System.out.println("Grouped Employees by Department:");
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
