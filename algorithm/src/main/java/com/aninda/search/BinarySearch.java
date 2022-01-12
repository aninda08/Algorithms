package com.aninda.search;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int bSearch(int key) {
        int low = 0;
        int high = this.array.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (this.array[mid] == key)
                return mid;
            else if (this.array[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return -1;
    }

    public int bSearchRec(int key) {
        return bSearchRec(key, 0, this.array.length - 1);
    }
    
    public int bSearchRec(int key, int low, int high) {
        int mid = (low + high) / 2;

        if (low > high)
            return -1;
        if (this.array[mid] == key)
            return mid;
        else if (this.array[mid] > key)
            return bSearchRec(key, low, mid - 1);
        else
            return bSearchRec(key, mid + 1, high);
    }

    public int exponentialSearch(int key) {
        if(this.array[0] == key)
            return 0;
        int i = 1;
        while(i<this.array.length && this.array[i] <= key)
            i *= 2;
        
        return bSearchRec(key, i / 2, Math.min(i, this.array.length - 1));
    }
}
