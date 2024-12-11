package com.assignment.task6;

public class Triangle {
    int sideA = 3, sideB = 4, sideC = 5;

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double perimeter = triangle.sideA + triangle.sideB + triangle.sideC;
        double s = perimeter / 2; // Semi-perimeter
        // Formula for calculating the area of a triangle
        double area = Math.sqrt(s * (s - triangle.sideA) * (s - triangle.sideB) * (s - triangle.sideC)); 

        System.out.println("Triangle Details:");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
