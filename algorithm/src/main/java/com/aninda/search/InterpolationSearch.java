package com.aninda.search;

public class InterpolationSearch {
    private int[] array;

    public InterpolationSearch(int[] array) {
        this.array = array;
    }

    public int iSearch(int key) {
        return iSearch(key, 0, this.array.length - 1);
    }

    public int iSearch(int key, int low, int high) {
        System.out.println("step");
        if(low > high)
            return -1;
        
        int position = low + ((high - low) / (this.array[high] - this.array[low])) *(key - this.array[low]) ;
        
        if(key == this.array[position])
            return position;
        else if(key > this.array[position])
            return iSearch(key, position + 1, high);
        else
            return iSearch(key, low, position - 1);
    }
    
}
