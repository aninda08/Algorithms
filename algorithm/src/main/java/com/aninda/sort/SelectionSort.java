package com.aninda.sort;

import java.util.Arrays;

public class SelectionSort {
    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0;i<this.array.length-1;i++){
            int minIndex = i;
            for (int j = i + 1; j < this.array.length; j++) {
                if (this.array[j] < this.array[minIndex])
                    minIndex = j;
            }
            
            int temp = this.array[minIndex];
            this.array[minIndex] = this.array[i];
            this.array[i] = temp;
        }
    }
    
    public void printArray() {
        System.out.println("after selection sort:: " + Arrays.toString(this.array));
    }
}
