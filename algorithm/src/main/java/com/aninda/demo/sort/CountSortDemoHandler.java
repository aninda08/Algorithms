package com.aninda.demo.sort;

import com.aninda.sort.CountSort;

public class CountSortDemoHandler {
    public static void countSortDemo() {
        char[] arr = { 'a', 'f', 'c', 'x', 'o', 'u', 'p', 'l', 's', 't' };

        CountSort ss = new CountSort(arr);

        System.out.println("Before applying count sort");
        ss.printArray();
        
        ss.sort();

        System.out.println("After applying count sort");
        ss.printArray();
    }
}
