package com.aninda.demo.backtracking;

import com.aninda.backtracking.RatMaze;

public class RatMazeDemoHandler {
    public static void ratMazeDemo() {
        RatMaze rat = new RatMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
 
        rat.solveMaze(maze);
    }
}
