package com.assignment.task6;

public class Rectangle {
    int length, breadth;

    // Constructor with no parameters
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Constructor with one parameter
    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    // Constructor with two parameters
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Function for calculating the area.
    public int calculateArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        // Making Objects for all the types of constructors defined here.
        // We have directly passed the hardcoded values for the construtors.
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        // Calling each object and then calculating the areas respectively.
        System.out.println("Rectangle 1 Area: " + r1.calculateArea());
        System.out.println("Rectangle 2 Area: " + r2.calculateArea());
        System.out.println("Rectangle 3 Area: " + r3.calculateArea());
    }
}
