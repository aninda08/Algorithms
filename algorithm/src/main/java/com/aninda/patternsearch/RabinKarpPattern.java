package com.aninda.patternsearch;

public class RabinKarpPattern {
    public static int d = 256;

    public static void search(String text, String pat, int q) {
        int h = 1;
        int p = 0;
        int t = 0;
        int j = 0;
        for (int i = 0; i < pat.length() - 1; i++) {
            h = (h * d) % q;
        }
        
        for (int i = 0; i < pat.length(); i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + pat.charAt(i)) % q;
        }

        for (int i = 0; i <= text.length() - pat.length(); i++) {
            if(p == t) {
                for (j = 0; j < pat.length(); j++) {
                    if (text.charAt(i + j) != pat.charAt(j))
                        break;
                }
                
                if (j == pat.length()) {
                   System.out.println("Pattern found at index" + i);
                }
                    
            }

            if(i < text.length() - pat.length()) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + pat.length())) % q;

                if(t < 0)
                    t = t + q;
            }
        }
    }
}
