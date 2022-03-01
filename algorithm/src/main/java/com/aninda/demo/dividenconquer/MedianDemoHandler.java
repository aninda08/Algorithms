package com.aninda.demo.dividenconquer;

import java.util.Arrays;

import com.aninda.dividenconquer.Median;

public class MedianDemoHandler {
    public static void medianDemo() {
        int arr1[] = {1,2,3,6};
        int arr2[] = {4,6,8,10};
        System.out.println("arr1 :: " + Arrays.toString(arr1) + " arr2 :: " + Arrays.toString(arr2));

        System.out.println("Median :: " + Median.getMedianFromTwoSortedArray(arr1, arr2));
    }
}
