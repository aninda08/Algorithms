package com.aninda.demo.sort;

import com.aninda.sort.MergeSort;

public class MergeSortDemoHandler {
    public static void mergeSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        MergeSort ss = new MergeSort(arr);

        System.out.println("Before applying merge sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying merge sort");
        ss.printArray();
    }
}
