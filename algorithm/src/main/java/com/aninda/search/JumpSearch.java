package com.aninda.search;

public class JumpSearch {
    private int[] array;

    public JumpSearch(int[] array) {
        this.array = array;
    }

    public int jSearch(int key) {
        int step = (int) Math.floor(Math.sqrt(this.array.length));
        
        for (int i = 0; i < this.array.length - 1; i += step) {
            if(this.array[i] == key)
                return i;
            else if (this.array[i] > key) {
                for (int j = i - step + 1; j < i; j++) {
                    if (this.array[j] == key)
                        return j;
                }
                return -1;
            }
        }
        return -1;
    }
    
}
