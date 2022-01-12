package com.aninda.search;

public class LinearSearch {

    private int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int lSearch(int key) {
        for (int i = 0; i < this.array.length - 1; i++) {
            if (array[i] == key)
                return i;
        }

        return -1;
    }
    
    public int lSearchOptimized(int key) {
        for (int i = 0, j = this.array.length - 1; i < this.array.length - 1 && j >= 0 && i <= j; i++, j--) {
            
            if(array[i] == key)
                return i;
            if(array[j] == key)
                return j;
        }
        return -1;
    }
}
