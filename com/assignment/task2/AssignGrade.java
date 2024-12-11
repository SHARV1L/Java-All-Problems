package com.assignment.task2;

public class AssignGrade {
    public static void main(String[] args) {
        assignGrade(85);
    }

    public static void assignGrade(int percentage) {
        char grade;
        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 75) {
            grade = 'B';
        } else if (percentage > 65) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}