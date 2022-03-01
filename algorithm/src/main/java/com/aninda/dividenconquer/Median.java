package com.aninda.dividenconquer;

public class Median {

    public static int getMedian(int arr[], int start, int end) {
        int n = end - start + 1;

        if (n % 2 == 0) {
            return (arr[start + (n / 2)] + arr[start + (n / 2 - 1)]) / 2;
        }
        else
            return arr[start + (n / 2)];
    }

    public static int getMedianFromTwoSortedArray(int[] a, int[] b, int startA, int startB, int endA, int endB) {
        if (endA - startA == 1)
            return (Math.max(a[startA], b[startB]) + Math.min(a[endA], b[endB])) / 2;

        int m1 = getMedian(a, startA, endA);
        int m2 = getMedian(b, startB, endB);

        if (m1 == m2)
            return m1;
        else if (m1 < m2)
            return getMedianFromTwoSortedArray(a, b, (endA + startA + 1) / 2, startB, endA, (endB + startB + 1) / 2);
        else
            return getMedianFromTwoSortedArray(a, b, startA, (endA + startA + 1) / 2, (endB + startB + 1) / 2, endB);

    }
    
    public static int getMedianFromTwoSortedArray(int[] a, int[] b) {
        return getMedianFromTwoSortedArray(a, b, 0, 0, a.length - 1, b.length - 1);
    }
    
}
