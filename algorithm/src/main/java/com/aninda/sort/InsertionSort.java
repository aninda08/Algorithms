package com.aninda.sort;

import java.util.Arrays;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1;i<this.array.length;i++){
            int current = this.array[i];
            int j = i-1;
            while (j >= 0 && current < this.array[j]) {
                this.array[j + 1] = this.array[j];
                j--;
            }
            this.array[j+1] = current;
        }
    }
    
    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
