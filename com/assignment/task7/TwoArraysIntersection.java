package com.assignment.task7;

import java.util.HashSet;
import java.util.Set;

public class TwoArraysIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        findIntersection(array1, array2);
    }

    public static void findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int i : array1) {  // iterating thwough the whole 'array1' and add all the elements in 'set1'
            set1.add(i);
        }
        for (int i : array2) {  // Now, while looping iterating array we'll first check if the element is already present in the set, if not then we add.
            if (set1.contains(i)) {
                intersection.add(i);
            }
        }
        System.out.println("Intersection: " + intersection);
    }
}
