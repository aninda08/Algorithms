package com.aninda.patternsearch;

public class KMPSearch {
    public static void search(String txt, String pat) {
        int[] lps = new int[pat.length()];
        
        computeLPS(lps, pat);

        int i = 0, j = 0;

        while(i < txt.length()) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == pat.length()) {
                System.out.println("Pattern found at index" + (i - j));
                j = lps[j - 1];
            }
            else if(i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if(j != 0) 
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    public static void computeLPS(int[] lps, String pat) {
        int i = 1, len = 0;
        lps[0] = 0;

        while(i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if(len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
