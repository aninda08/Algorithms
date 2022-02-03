package com.aninda.sort;

import java.util.Arrays;

public class HeapSort {private int[] array;
    

    public HeapSort(int[] array) {
        this.array = array;
    }
    
    public void sort() {
        int size = this.array.length;

        for (int i = (size / 2) - 1; i >= 0; i--) {
            heapify(i, size);
        }
        
        for (int j = size - 1; j > 0;j--){
            int temp = this.array[0];
            this.array[0] = this.array[j];
            this.array[j] = temp;

            heapify(0, j);

        }
    }

    public void heapify(int root, int size) {
        int largest = root;
        int l = 2 * root +1;
        int r = 2 * root +2;

        if(l<size && this.array[l]>this.array[largest])
            largest = l;

        if(r<size && this.array[r]>this.array[largest])
            largest = r;

        if (largest != root) {
            int swap = this.array[root];
            this.array[root] = this.array[largest];
            this.array[largest] = swap;

            heapify(largest, size);
        }
    }

    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
