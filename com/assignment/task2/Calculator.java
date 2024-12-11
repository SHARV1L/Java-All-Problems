package com.assignment.task2;

public class Calculator {
    public static void main(String[] args) {
        // For simplicity I have directly called the fucntion instead of taking the user inputs!
        calculator(10, 5, '*'); 
    }

    public static void calculator(int num1, int num2, char operator) {
        try {
            int result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("You can't divide a number by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation, choose the correct option.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
