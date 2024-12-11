package com.assignment.task7;

import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Brad", 4);
        map.put("Mike", 3);
        map.put("Chester", 2);
        map.put("Rob", 1);

        System.out.println("Original HashMap: " + map);

        sortByKeys(map);
        sortByValues(map);
    }

    public static void sortByKeys(HashMap<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted by Keys: " + sortedMap);
    }

    public static void sortByValues(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by Values: " + entries);
    }
}
