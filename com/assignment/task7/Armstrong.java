package com.assignment.task7;

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        checkArmstrong(number);
    }

    public static void checkArmstrong(int number) {
        int original = number, sum = 0, digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
