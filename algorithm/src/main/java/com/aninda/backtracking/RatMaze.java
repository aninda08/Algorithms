package com.aninda.backtracking;

public class RatMaze {
    public void printSolution(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void solveMaze(int[][] maze) {
        int sol[][] = new int[maze.length][maze[0].length];

        if (solveMazeUtil(maze, sol, 0, 0)) {
            printSolution(sol);
            return;
        }
        
        System.out.println("There is no solution for this maze");
    }

    public boolean solveMazeUtil(int[][] maze, int[][] sol, int destX, int destY) {

        if (destX == maze.length - 1 && destY == maze[0].length - 1 && maze[destX][destY] == 1) {
            sol[destX][destY] = 1;
            return true;
        }

        if(destX >= 0 && destY >= 0 && destX < maze.length && destY < maze[0].length && maze[destX][destY] == 1 ) {
            if(sol[destX][destY] == 1)
                return false;
            
            sol[destX][destY] = 1;

            if(solveMazeUtil(maze, sol, destX + 1, destY)) 
                return true;
            
            if(solveMazeUtil(maze, sol, destX, destY + 1))
                return true;
            
            if(solveMazeUtil(maze, sol, destX - 1, destY))
                return true;

            if(solveMazeUtil(maze, sol, destX, destY - 1))
                return true;
            
            sol[destX][destY] = 0;
            return false;
        }

        return false;
    }
    
}
