package com.aninda.sort;

import java.util.Arrays;

public class RadixSort {
    private int[] array;

    public RadixSort(int[] array) {
        this.array = array;
    }

    public int getMax() {
        int max = this.array[0];

        for (int i = 1; i < this.array.length; i++) {
            if (this.array[i] > max)
                max = this.array[i];
        }

        return max;
    }
    
    public void countSort(int exp) {
        int n = this.array.length;

        int output[] = new int[n];
        int count[] = new int[10];

        for(int i = 0; i < 10; i++)
            count[i] = 0;

        for(int i = 0; i < n; i++)
            ++count[(this.array[i] / exp) % 10];

        for(int i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (int i = n - 1; i >= 0; i--) {
            output[count[(this.array[i] / exp) % 10] - 1] = this.array[i];
            --count[(this.array[i] / exp) % 10];
        }

        for(int i = 0; i < n; i++)
            this.array[i] = output[i];
            
    }

    public void sort() {
        int max = getMax();

        for(int exp = 1; (max / exp) > 0; exp *= 10)
            countSort(exp);
    }
    
    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
    
}
