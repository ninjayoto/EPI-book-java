package com.ryangehring.epi.solutions.c17;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class P05 {


    public static int maxFishDynamic(Integer[][] grid, int x, int y, int value, Map<String, Integer> store) {
        int n = grid[0].length ;
        int m = grid.length ;
        String key = x+"-"+y ;
        value = value + grid[x][y] ;

        if (store.get(key) != null) {
            if (store.get(key) > value ) {
                value = store.get(key);
            } else {
                store.put(key, value) ;
            }
        }


        if ((x==n-1) && (y==m-1)) return value ;

        int out = 0 ;
        if ( (x == n-1) ) {
            out = maxFishDynamic(grid, x, y+1, value, store) ;
        } else if (y==m-1)  {
            out = maxFishDynamic(grid, x+1, y, value, store) ;
        } else {
            int outRight = maxFishDynamic(grid, x+1, y, value, store)  ;
            int outDown = maxFishDynamic(grid, x, y+1, value, store) ;
            if (outRight > outDown) {
                out = outRight ;
            } else {
                out = outDown;
            }
        }

        return out ;

    }

    public static int maxFish(Integer[][] grid) {
        Map<String, Integer> store = new HashMap<>();
        int x=0; int y=0;
        return maxFishDynamic(grid,x,y,0, store);
    }

}