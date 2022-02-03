package com.aninda;

import com.aninda.sort.InsertionSort;

public class InsertionSortDemoHandler {
    public static void insertionSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        InsertionSort ss = new InsertionSort(arr);

        System.out.println("Before applying Insertion sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying Insertion sort");
        ss.printArray();
    }
}
