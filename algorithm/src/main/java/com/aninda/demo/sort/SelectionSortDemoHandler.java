package com.aninda.demo.sort;

import java.util.Arrays;

import com.aninda.sort.SelectionSort;

public class SelectionSortDemoHandler {
    public static void selectionSortDemo() {
        int[] arr = { 12, 24, 13, 4, 35, 60, 7, 27, 58, 99 };

        System.out.println("Selection Sorting on array:: " + Arrays.toString(arr));

        SelectionSort ss = new SelectionSort(arr);

        ss.sort();

        ss.printArray();
    }
}
