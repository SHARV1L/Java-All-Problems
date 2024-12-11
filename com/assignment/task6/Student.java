package com.assignment.task6;

public class Student {
    String name;
    int EnrollmentNo;

    public static void main(String[] args) {
        Student student = new Student();  // we create a student object of the Student type.
        student.name = "Amay";            
        student.EnrollmentNo = 132;       

        System.out.println("Student Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Enrollment Number: " + student.EnrollmentNo);
    }
}
