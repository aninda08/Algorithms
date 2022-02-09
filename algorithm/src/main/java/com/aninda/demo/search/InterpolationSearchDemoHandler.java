package com.aninda.demo.search;

import java.util.Arrays;

import com.aninda.search.InterpolationSearch;

public class InterpolationSearchDemoHandler {
    public static void interpolationSearchDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 19, 100 };
        int key = 3;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Interpolation Search for element :: " + key);

        InterpolationSearch ls = new InterpolationSearch(arr);
        int position = ls.iSearch(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
