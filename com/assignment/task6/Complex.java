package com.assignment.task6;

import java.util.Scanner;

public class Complex {
    final private double real;
    final private double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Adding two Complex Numbers
    public static Complex add(double real1, double imaginary1, double real2, double imaginary2) {
        double newReal = real1 + real2; // Adding real parts
        double newImaginary = imaginary1 + imaginary2; // Adding imaginary parts
        return new Complex(newReal, newImaginary);
    }

    // Subtracting two complex numbers
    public static Complex subtract(double real1, double imaginary1, double real2, double imaginary2) {
        double newReal = real1 - real2; // Subtracting real parts
        double newImaginary = imaginary1 - imaginary2; // Subtracting imaginary parts
        return new Complex(newReal, newImaginary);
    }

    // Multiplying two complex numbers
    public static Complex multiply(double real1, double imaginary1, double real2, double imaginary2) {
        double realPart = (real1 * real2) - (imaginary1 * imaginary2); // Multiplying real part
        double imaginaryPart = (real1 * imaginary2) + (imaginary1 * real2); // Multiplying imaginary part
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 1. Input for the first complex number
            System.out.println("Enter the real part of the first complex number:");
            double real1 = sc.nextDouble();
            System.out.println("Enter the imaginary part of the first complex number:");
            double imaginary1 = sc.nextDouble();

            // 2. Input for the second complex number
            System.out.println("Enter the real part of the second complex number:");
            double real2 = sc.nextDouble();
            System.out.println("Enter the imaginary part of the second complex number:");
            double imaginary2 = sc.nextDouble();

            Complex sum = Complex.add(real1, imaginary1, real2, imaginary2);
            Complex difference = Complex.subtract(real1, imaginary1, real2, imaginary2);
            Complex product = Complex.multiply(real1, imaginary1, real2, imaginary2);

            // 3. Displaying the final results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
        } finally {
            sc.close();
        }
    }
}