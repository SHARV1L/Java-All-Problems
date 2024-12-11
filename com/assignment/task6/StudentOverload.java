package com.assignment.task6;

public class StudentOverload {
    String name;

    StudentOverload() {   // No arg Constructor
        this.name = "Unknown";
    }

    StudentOverload(String name) {  // Arg Constructor
        this.name = name;
    }

    public static void main(String[] args) {
        StudentOverload s1 = new StudentOverload();
        StudentOverload s2 = new StudentOverload("Brad Delson");

        System.out.println("Student 1 Name: " + s1.name);
        System.out.println("Student 2 Name: " + s2.name);
    }
}