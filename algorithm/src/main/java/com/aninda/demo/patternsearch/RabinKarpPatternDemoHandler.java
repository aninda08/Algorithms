package com.aninda.demo.patternsearch;

import com.aninda.patternsearch.RabinKarpPattern;

public class RabinKarpPatternDemoHandler {
    public static void searchDemo() {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        int q = 101;
        System.out.println("Search pattern :: " + pattern + " in text :: " + text);
        RabinKarpPattern.search(text, pattern, q);
    }
}
