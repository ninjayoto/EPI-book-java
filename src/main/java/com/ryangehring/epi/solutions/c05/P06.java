package com.ryangehring.epi.solutions.c05;

/**
 * Compsci division.
 * Integer division rounded down.
 *
 * The main idea of this algorithm is:
 * x / y = 0 if x < y
 * otherwise, its (1 + (x-y) / y)
 *
 */
public class P06 {

    public static int msb(int x) {
        for (int i=0; i < 31 ; i++) {
            if ((1 & (x >> (31-i) )) == 1) return (32-i) ;
        }
        return -1 ;
    }

    // this naive version is O(x/y)
    // a better version would iterate for the largest power of 2 coef on y.
    public static Long divide(int x, int y) {
        Long out = 0L ;

        while (true) {
            if (x < y) return out ;
            x = x-y ;
            out = out + 1 ;
        }

    }


}
