package com.aninda.demo.search;

import java.util.Arrays;

import com.aninda.search.BinarySearch;

public class BinarySearchDemoHandler {
    public static void binarySearchDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 5;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Binary Search for element :: " + key);

        BinarySearch ls = new BinarySearch(arr);
        int position = ls.bSearch(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void binarySearchRecDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 8;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Binary Search recursive method for element :: " + key);

        BinarySearch ls = new BinarySearch(arr);
        int position = ls.bSearchRec(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void exponentialSearchRecDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 8;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Exponential Search recursive method for element :: " + key);

        BinarySearch ls = new BinarySearch(arr);
        int position = ls.exponentialSearch(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
