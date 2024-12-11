package com.assignment.task2;

public class CompQuoAndRem {
    public static void main(String[] args) {
        int dividend = 25, divisor = 4; 
        try {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}