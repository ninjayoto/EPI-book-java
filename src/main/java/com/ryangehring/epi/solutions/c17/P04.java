package com.ryangehring.epi.solutions.c17;

import java.util.HashMap;
import java.util.Map;

/**
 * How many ways are there to go down from top left to bottomw right corner
 * - you must make n down steps and m right steps
 * It's equal to f(n-1, m) + f(n, m-1)
 *
 *
 * In the presence of obstacles--- i can put in an algorithm that
 * skips if thre is a collision.
 *
 * Lets implement.
 */
public class P04 {

    public static int nWapsDynamic(Boolean[][] grid, int x, int y, Map<String, Integer> store) {
        int n = grid[0].length ;
        int m = grid.length ;
        String key = x+"-"+y ;
        if (grid[x][y]) return 0 ;
        if ( (x == n-1) || (y==m-1)) return 1 ;
        if (store.get(key) != null) return store.get(key) ;
        store.put(key, (nWapsDynamic(grid, x+1, y, store) + nWapsDynamic(grid, x,y+1,store)));
        return store.get(key) ;
    }

    public static int nWays(Boolean[][] grid) {
        Map<String, Integer> store = new HashMap<>();
        int x=0; int y=0;
        return nWapsDynamic(grid,x,y,store);
    }

}
