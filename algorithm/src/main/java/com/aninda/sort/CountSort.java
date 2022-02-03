package com.aninda.sort;

import java.util.Arrays;

public class CountSort {
    private char[] array;

    public CountSort(char[] array) {
        this.array = array;
    }

    public void sort() {
        int n = this.array.length;

        char output[] = new char[n];
        int count[] = new int[256];

        for(int i = 0; i < 256; i++)
            count[i] = 0;

        for(int i = 0; i < n; i++)
            ++count[this.array[i]];

        for(int i = 1; i < 256; i++)
            count[i] += count[i - 1];


        for (int i = n - 1; i >= 0; i--) {
            output[count[this.array[i]] - 1] = this.array[i];
            --count[this.array[i]];
        }

        for(int i = 0; i < n; i++)
            this.array[i] = output[i];
            
    }

    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
