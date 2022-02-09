package com.aninda.demo.search;

import java.util.Arrays;

import com.aninda.search.LinearSearch;

public class LinearSearchDemoHandler {

    public static void linearSearchDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 5;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Linear Search for element :: " + key);

        LinearSearch ls = new LinearSearch(arr);
        int position = ls.lSearch(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }
    
    public static void linearSearchOptimizedDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 8;

        System.out.println("Optimized Linear Search on array:: " + Arrays.toString(arr));

        System.out.println("Searching for element :: " + key);

        LinearSearch ls = new LinearSearch(arr);
        int position = ls.lSearchOptimized(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
