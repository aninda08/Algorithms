package com.aninda.demo.backtracking;

import com.aninda.backtracking.KnightTour;

public class KnightTourDemoHandler {
    public static void knightTourDemo() {
        System.out.println("Knight tour for 8 x 8 chess board from first block position");
        int[][] chessBoard = new int[8][8];
        KnightTour.printKnightTour(chessBoard, 0, 0, 1);
    }
}
