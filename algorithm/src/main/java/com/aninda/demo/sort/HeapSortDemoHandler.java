package com.aninda.demo.sort;

import com.aninda.sort.HeapSort;

public class HeapSortDemoHandler {
    public static void heapSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        HeapSort ss = new HeapSort(arr);

        System.out.println("Before applying heap sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying heap sort");
        ss.printArray();
    }
}
