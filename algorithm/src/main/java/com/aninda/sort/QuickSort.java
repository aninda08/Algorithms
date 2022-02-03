package com.aninda.sort;

import java.util.Arrays;

public class QuickSort {
    private int[] array;
    
    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        sort(0,this.array.length - 1);
    }

    public void sort(int low, int high) {
        if (low < high) {
            int partition = partition(low, high);

            sort(0, partition - 1);
            sort(partition + 1, high);
        }
    }

    public int partition(int low, int high) {
        int i = low - 1;
        int pivot = this.array[high];

        for (int j = low; j <= high - 1; j++) {
            if (this.array[j] < pivot) {
                i++;
                int temp = this.array[i];
                this.array[i] = this.array[j];
                this.array[j] = temp;
            }
        }

        int temp = this.array[i + 1];
        this.array[i + 1] = this.array[high];
        this.array[high] = temp;

        return (i + 1);
    }
    

    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
