package com.aninda.demo.sort;

import com.aninda.sort.BubbleSort;

public class BubbleSortDemoHandler {
    public static void bubbleSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        BubbleSort ss = new BubbleSort(arr);

        System.out.println("Before applying Bubble sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying Bubble sort");
        ss.printArray();
    }
}
