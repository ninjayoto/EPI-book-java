package com.ryangehring.epi.solutions.c19;

/**
 * Paint filling algorithm
 *
 * Just do a BFS for the opposite color of the given square and flip it.
 * I'll just use a boolean array.
 *
 */
public class P03 {


    public static void paintFillRecursion(boolean[][] grid, int x, int y, boolean baseColor) {
        if ((x < 0) || (x >= grid.length)) return;
        if ((y < 0) || (y >= grid[0].length)) return;
        if (grid[x][y] == baseColor) {
            grid[x][y] = !grid[x][y];
            paintFillRecursion(grid, x+1, y, baseColor);
            paintFillRecursion(grid, x-1, y, baseColor);
            paintFillRecursion(grid, x, y+1, baseColor);
            paintFillRecursion(grid, x, y-1, baseColor);
        }
    }


    public static void paintFill(boolean[][] grid, int x, int y) {
        boolean baseColor = grid[x][y];
        paintFillRecursion(grid,x,y,baseColor);

    }





}
