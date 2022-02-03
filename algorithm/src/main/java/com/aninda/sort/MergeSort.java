package com.aninda.sort;

import java.util.Arrays;

public class MergeSort {
    private int[] array;

    public MergeSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        sort(this.array,0, this.array.length-1);
    }
    
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = low +(high-low)/2;
            sort(arr, low, middle);
            sort(arr, middle + 1, high);
            merge(arr,low,middle,high);
        }
    }

    public void merge(int[] arr,int low, int middle,int high) {
        int m1=middle-low+1;
        int m2=high-middle;

        int[] temp1 = new int[m1];
        int[] temp2 = new int[m2];

        for(int i=0;i<m1;i++)
            temp1[i] = arr[low + i];
        for(int j=0;j<m2;j++)
            temp2[j] = arr[middle + j + 1];
        
        int i = 0, j = 0, k = low;
        while (i < m1 && j < m2) {
            if (temp1[i] <= temp2[j]) {
                arr[k] = temp1[i];
                i++;
            } else {
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }
        
        while(i<m1)
        {
            arr[k] = temp1[i];
            i++;
            k++;
        }
        while(j<m2)
        {
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }
    
    public void printArray() {
        System.out.println("Array:: " + Arrays.toString(this.array));
    }
}
