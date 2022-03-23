package com.aninda.demo.patternsearch;

import com.aninda.patternsearch.KMPSearch;

public class KMPSearchDemoHandler {
    public static void searchDemo() {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        System.out.println("Search pattern :: " + pattern + " in text :: " + text);
        KMPSearch.search(text, pattern);
    }
}
