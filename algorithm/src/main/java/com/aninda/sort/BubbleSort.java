package com.aninda.sort;

import java.util.Arrays;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0;i<this.array.length;i++){
            boolean swap = true;
            for (int j = 0; j < this.array.length - i - 1; j++) {
                if (this.array[j + 1] < this.array[j]) {
                    swap = false;
                    int temp = this.array[j + 1];
                    this.array[j + 1] = this.array[j];
                    this.array[j] = temp;
                }
            }
            if(swap)
                break;
        }
    }
    
    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
