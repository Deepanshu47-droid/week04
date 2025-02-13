package com.datastructures.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {
    private List<Employee> employees;

    @BeforeEach
    void setUp() {
        // Initializing a list of employees before each test
        employees = new ArrayList<>();
        employees.add(new Employee("Shubh", "HR"));
        employees.add(new Employee("Deepanshu", "IT"));
        employees.add(new Employee("Raj", "HR"));
        employees.add(new Employee("Gagan", "IT"));
        employees.add(new Employee("Shubham", "Finance"));
    }

    @Test
    void testGroupByDepartment() {
        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        // Verifying the grouping
        assertEquals(3, groupedEmployees.size(), "There should be 3 departments");

        // Checking employees in each department
        assertEquals(2, groupedEmployees.get("HR").size(), "HR should have 2 employees");
        assertEquals(2, groupedEmployees.get("IT").size(), "IT should have 2 employees");
        assertEquals(1, groupedEmployees.get("Finance").size(), "Finance should have 1 employee");

        // Verifying employee names in the "HR" department
        List<Employee> hrEmployees = groupedEmployees.get("HR");
        assertTrue(hrEmployees.toString().contains("Shubh") && hrEmployees.toString().contains("Raj"),
                "HR should contain Shubh and Raj");
    }

    @Test
    void testGroupByDepartmentWithEmptyList() {
        List<Employee> emptyList = new ArrayList<>();

        // Grouping an empty list of employees
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(emptyList);

        // Verifying that the map is empty
        assertTrue(groupedEmployees.isEmpty(), "Grouped map should be empty for an empty employee list");
    }

    @Test
    void testGroupByDepartmentSingleEmployee() {
        List<Employee> singleEmployeeList = new ArrayList<>();
        singleEmployeeList.add(new Employee("Yogesh", "Marketing"));

        // Grouping a single employee
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(singleEmployeeList);

        // Verifying the grouping
        assertEquals(1, groupedEmployees.size(), "There should be 1 department");
        assertEquals(1, groupedEmployees.get("Marketing").size(), "Marketing should have 1 employee");
        assertEquals("Yogesh", groupedEmployees.get("Marketing").get(0).toString(),
                "Marketing department should contain Yogesh");
    }
}
