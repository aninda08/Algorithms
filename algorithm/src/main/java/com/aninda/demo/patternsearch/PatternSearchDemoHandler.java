package com.aninda.demo.patternsearch;

import com.aninda.patternsearch.NativeSearch;

public class PatternSearchDemoHandler {
    public static void searchDemo() {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        System.out.println("Search pattern :: " + pattern + " in text :: " + text);
        NativeSearch.search(text, pattern);
    }
}
