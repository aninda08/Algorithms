package com.aninda;

import java.util.Arrays;

import com.aninda.search.JumpSearch;

public class JumpSearchDemoHandler {
    public static void jumpSearchDemo() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int key = 5;

        System.out.println("Searching on array:: " + Arrays.toString(arr));

        System.out.println("Jump Search for element :: " + key);

        JumpSearch ls = new JumpSearch(arr);
        int position = ls.jSearch(key);
        if (position >= 0) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}
