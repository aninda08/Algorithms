package com.aninda.demo.dividenconquer;

import java.util.Arrays;

import com.aninda.dividenconquer.CountInversion;

public class CountInversionDemoHandler {
    public static void countInversionDemo() {
        int array[] = {1,20,6,4,5};
        System.out.println("Input array :: " + Arrays.toString(array));

        System.out.println("Inversion count :: " + CountInversion.counts(array));
    }
}
