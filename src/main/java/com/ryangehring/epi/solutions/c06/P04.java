package com.ryangehring.epi.solutions.c06;

/**
 * Iterate over the array. Keep the 'curr max farthest' updated.
 * If that reaches 0 prior to end false.
 *
 */
public class P04 {



    public static Boolean isWinnable(Integer[] x) {
        if (x.length < 2) return true ;
        int currMaxFarthest = 0 ;
        int endAt = x.length - 1 ;
        int idx = 0 ;
        while (true) {
            if (idx == endAt) return true ;
            if (x[idx] > currMaxFarthest) {
                currMaxFarthest = x[idx];
            }
            if (currMaxFarthest <= 0) return false;
            idx++ ;
            currMaxFarthest-- ;
        }
    }

}
