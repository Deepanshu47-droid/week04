package com.filehandling.serialization;

import java.io.Serializable;

// Employee class representing an employee's details
// Implements Serializable to allow object serialization
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // Employee fields: id, name, department, and salary
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor to initialize Employee fields
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods to access employee details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Overriding the toString method for displaying employee details
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + ", Salary=" + salary + "]";
    }
}
