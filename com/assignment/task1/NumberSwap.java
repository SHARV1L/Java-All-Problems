// We'll now perform call by value policy for calling the methods so that we can keep our main function 
// clean and just use it for necessary tasks like function calling or sometimes printing the results and tasks like that!/.
// From now on I'll try to adhere to this convention.

package com.assignment.task1;

public class NumberSwap {
    public static void main(String[] args) {
        swapNumbers(5, 10); 
    }

    public static void swapNumbers(int a, int b) {
        // Using a third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped (with third variable): a = " + a + ", b = " + b);

        // Without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped (without third variable): a = " + a + ", b = " + b); 
        // Because the swapping has been done twice, so we'll get the same values as that of the Input variables.
    }
}
