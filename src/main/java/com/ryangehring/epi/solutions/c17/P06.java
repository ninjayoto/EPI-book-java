package com.ryangehring.epi.solutions.c17;

import java.util.HashMap;
import java.util.Map;

/**
 * Iterate the grid until you find an element equal to the first in the dest array.
 * When you find a match for first ele, launch a BFS for subsequent matches.
 * Mark all squares as searched or unsearched.
 *
 * ^--- that's possibly less efficient than the recursive solution
 * go through the grid, if the square has an adjacent character matching offset+1 char, return true.
 *
 *
 *
 */
public class P06 {



    public static Boolean isMatch(Integer[][] grid, Integer[] data, int x, int y, int offset,  Map<String, Boolean> store) {
        int n = grid[0].length ;
        int m = grid.length ;
        String key = x + " " + y + " " + offset;

        if (offset >= data.length) return true ;
        if ((x < 0) || (x >= n)) return false ;
        if ((y < 0) || (y >= m)) return false ;

        if (store.get(key) != null) {
            return store.get(key) ;
        }

        if ((grid[x][y].equals( data[offset])) && (
                (isMatch(grid, data, x+1,y,offset+1,store)) ||
                (isMatch(grid, data, x-1,y,offset+1,store)) ||
                (isMatch(grid, data, x,y+1,offset+1,store)) ||
                (isMatch(grid, data, x,y-1,offset+1,store))
        )) {
            return true ;
        }
        store.put(key, false);
        return false ;
    }

    public static Boolean occursIn(Integer[][] grid, Integer[] x) {
        Map<String, Boolean> store = new HashMap<>();

        int n = grid[0].length ;
        int m = grid.length ;


        for (int i=0;i<n;i++) {
            for (int j=0;i<m;j++) {
                if (isMatch(grid, x, i, j, 0, store) ) return true ;
            }
        }
        return false ;

    }

}
