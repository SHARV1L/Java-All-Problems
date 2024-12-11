package com.assignment.task1;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        calculateArea(); // Call the task-specific function
    }

    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
        scanner.close();
    }
}
