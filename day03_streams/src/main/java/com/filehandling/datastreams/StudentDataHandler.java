package com.filehandling.datastreams;

import java.io.*;

public class StudentDataHandler {

    public static void main(String[] args) {

        // Defining the file name to store student data
        String fileName = "C:\\Users\\Lenovo\\Desktop\\capgemini\\classroom\\week04-copy\\day03_streams\\src\\main\\java\\com\\filehandling\\datastreams\\student_data.bin";

        // Storing student details into the binary file
        storeStudentData(fileName);

        // Retrieving and displaying student details from the binary file
        retrieveStudentData(fileName);
    }

    // Method for storing student data into a binary file using DataOutputStream
    private static void storeStudentData(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             DataOutputStream dos = new DataOutputStream(fos)) {

            // Writing student details (roll number, name, GPA) to the binary file
            dos.writeInt(101);          // Roll number
            dos.writeUTF("Raj Verma");  // Name
            dos.writeDouble(8.5);       // GPA

            dos.writeInt(102);          // Roll number
            dos.writeUTF("Shubham Jain"); // Name
            dos.writeDouble(9.1);       // GPA

            dos.writeInt(103);          // Roll number
            dos.writeUTF("Deepanshu Malviya"); // Name
            dos.writeDouble(8.8);       // GPA

            // Printing success message
            System.out.println("Student data successfully stored in " + fileName);

        } catch (IOException e) {
            // Handling IOException
            System.out.println("Error while storing student data: " + e.getMessage());
        }
    }

    // Method for retrieving student data from the binary file using DataInputStream
    private static void retrieveStudentData(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)) {

            // Reading and displaying student details until the end of the file
            System.out.println("Retrieving student data from " + fileName + ":");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();       // Reading roll number
                String name = dis.readUTF();          // Reading name
                double gpa = dis.readDouble();        // Reading GPA

                // Printing student details
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }

        } catch (IOException e) {
            // Handling IOException
            System.out.println("Error while retrieving student data: " + e.getMessage());
        }
    }
}
