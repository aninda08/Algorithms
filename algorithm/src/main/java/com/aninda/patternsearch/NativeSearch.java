package com.aninda.patternsearch;

public class NativeSearch {
    public static void search(String txt, String pat) {
        int i, j;

        for (i = 0; i <= txt.length() - pat.length(); i++) {
            for(j = 0; j < pat.length() ; j++)
                if(txt.charAt(i + j) != pat.charAt(j))
                    break;

            if(j == pat.length())
                System.out.println("Pattern found at position :: " + i);
        }
    }
}
