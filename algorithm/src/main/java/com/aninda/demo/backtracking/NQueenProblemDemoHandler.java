package com.aninda.demo.backtracking;

import com.aninda.backtracking.NQueenProblem;

public class NQueenProblemDemoHandler {
    public static void NQueenProblemDemo() {
        int n = 4;
        System.out.println("NQueen solution for :: " + n);

        NQueenProblem nQueen = new NQueenProblem(n);
        nQueen.solveNQ();
    }
}
