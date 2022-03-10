package com.aninda.backtracking;

public class Permutation {
    public static void permute(String input) {
        permute(input, 0 , input.length() - 1);
    }
    
    public static void permute(String input, int l, int r) {
        if(l == r)
            System.out.println(input);
        else {
            for (int i = l; i <= r; i++){
                input = swap(input, l, i);

                permute(input, l + 1, r);

                input = swap(input, l, i);
            }
        }
    }

    public static String swap(String str, int l, int r) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[l];
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray); 
    }
}
