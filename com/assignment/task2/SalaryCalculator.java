package com.assignment.task2;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the basic salary of the employee:");
            double salary = sc.nextDouble();

            double hra = 0;
            double da = 0;

            // We will calculate HRA and DA based on given conditions
            if (salary <= 15000) {
                hra = 0.25 * salary; 
                da = 0.82 * salary; 
            } else if (salary <= 20200) {
                hra = 0.27 * salary; 
                da = 0.90 * salary; 
            } else {
                hra = 0.36 * salary; 
                da = 0.95 * salary; 
            }

            double grossSalary = salary + hra + da;

            System.out.println("Gross Salary: " + grossSalary);
        } finally {
            sc.close();
        }
    }
}
