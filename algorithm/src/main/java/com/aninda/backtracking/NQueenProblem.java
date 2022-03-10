package com.aninda.backtracking;

import java.util.Arrays;

public class NQueenProblem {
    private int n;

    public NQueenProblem(int n) {
        this.n = n;
    }
    
    public boolean solveNQ() {
        int[][] board = new int[n][n];

        for (int[] row : board)
            Arrays.fill(row, 0);
        
        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(int[][] board, int row, int col) {
        int i, j;

        for(i = 0; i < col; i++)
            if(board[row][i] == 1)
                return false;
        
        for(i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if(board[i][j] == 1)
                return false;
            
        for(i = row, j = col; i < this.n && j >=0 ; i++, j--)
            if(board[i][j] == 1)
                return false;

        return true;
    }
    
    public boolean solveNQUtil(int[][] board, int col) {
        if(col >= this.n)
            return true;

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if(solveNQUtil(board,col + 1))
                    return true;
                
                board[i][col] = 0;
            }
        }

        return false;
    }
}
