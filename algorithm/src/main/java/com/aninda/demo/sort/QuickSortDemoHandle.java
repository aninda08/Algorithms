package com.aninda.demo.sort;

import com.aninda.sort.QuickSort;

public class QuickSortDemoHandle {
    public static void quickSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        QuickSort ss = new QuickSort(arr);

        System.out.println("Before applying heap sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying heap sort");
        ss.printArray();
    }
}
