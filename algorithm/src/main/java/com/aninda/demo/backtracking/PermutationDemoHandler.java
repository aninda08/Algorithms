package com.aninda.demo.backtracking;

import com.aninda.backtracking.Permutation;

public class PermutationDemoHandler {
    public static void permutationDemo() {
        String input = "";
        System.out.println("Input string :: " + input);

        System.out.println("Permutation of the string --> ");

        Permutation.permute("ABC");
    }
}
