package com.assignment.task6;

public class Employee {
    String name, address;
    int yearOfJoining, salary;

    // Parameterized constructor with all the required varibles
    Employee(String name, int yearOfJoining, int salary, String address) { 
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public static void main(String[] args) {
        // We manually pass the values inside the constructor using different objects like e1, e2 and e3
        Employee e1 = new Employee("Robert", 1994, 50000, "64C- Walls Street");  
        Employee e2 = new Employee("Sam", 2000, 60000, "68D- Walls Street");
        Employee e3 = new Employee("John", 1999, 55000, "26B- Walls Street");

        // We use '%-10s' for 10 spaces and '%-20s' for 20 spaces(as the address might be long) and then '%n' for ending the printing space.
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Name", "Year", "Salary", "Address");
        System.out.printf("%-10s %-10d %-10d %-20s%n", e1.name, e1.yearOfJoining, e1.salary, e1.address);
        System.out.printf("%-10s %-10d %-10d %-20s%n", e2.name, e2.yearOfJoining, e2.salary, e2.address);
        System.out.printf("%-10s %-10d %-10d %-20s%n", e3.name, e3.yearOfJoining, e3.salary, e3.address);
    }
}
