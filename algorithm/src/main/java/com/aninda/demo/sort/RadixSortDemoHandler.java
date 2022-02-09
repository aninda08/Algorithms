package com.aninda.demo.sort;

import com.aninda.sort.RadixSort;

public class RadixSortDemoHandler {
    public static void radixSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        RadixSort ss = new RadixSort(arr);

        System.out.println("Before applying radix sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying radix sort");
        ss.printArray();
    }
}
