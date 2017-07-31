package com.ryangehring.epi.solutions.c06;

/**
 * Increment a biginteger
 * Go to the end. If it's not nine, increment and return.
 * If it's 9,
 */
public class P02 {

    public static int[] incrementBigInteger(int[] x) {
        int idx = x.length - 1 ;
        while (idx >= 0) {
            if (x[idx] < 9) {
                x[idx] ++ ;
                return x ;
            } else {
                x[idx] = 0 ;
                idx = idx - 1 ;
            }
        }
        int[] out = new int[x.length + 1] ;
        out[0] = 1 ;
        for (int j=0; j<x.length ; j++) {
            out[j+1] = x[j] ;
        }
        return out ;

    }
}
