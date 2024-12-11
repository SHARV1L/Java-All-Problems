package com.assignment.task3;

public class AddNum {
    public static void main(String[] args) {
        performAdditionLoop(5, 7); // Printing the Addition 5 and 7
    }

    public static void performAdditionLoop(int num1, int num2) {
        try {
            int sum;
            do {
                sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            } while (false); // We need to do this to simulate a single iteration using a do-while loop
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}