package com.ryangehring.epi.solutions.c07;

/**
 * Perform a mutation of the chararray with alphabet [a,b,c,d]
 * The mutation is: erase all b's and replace all 'a's with 'dd'
 * This operation is an example of a mutation that can both shorten
 * and lengthen an array. and so to do it most efficiently, you
 * can do a two-pass approach, performing all 'shorten' operations
 * as you iterate up from the start of the array, and all 'lengthen'
 * operations as you iterate down from the end.
 */
public class P02 {

    public static char[] mutateCharArray(char[] x) {
        int backshift = 0 ;
        int upshift = 0;
        int lastIdx = -1 ;
        for (int i=0; i<x.length; i++) {
            if (!(x[i] == 'a' || x[i] == 'b' || x[i] == 'c' || x[i] == 'd')) {
                lastIdx = i - backshift;
                break ;
            }
            if (x[i] == 'b') {
                backshift ++ ;
                lastIdx = i -backshift;
                continue;
            } if (x[i] == 'a') {
                upshift ++ ;
            }
            x[i - backshift] = x[i] ;
            lastIdx = i -backshift;
        }
        for (int i=0; i<=lastIdx; i++) {
            int idx = lastIdx - i  ;
            if (!(x[idx] == 'a' || x[idx] == 'b' || x[idx] == 'c' || x[idx] == 'd')) {continue; }
            if (x[idx] == 'a') {
                x[idx + upshift] = 'd';
                x[idx + upshift - 1 ] = 'd';
                upshift = upshift -1 ;
            } else {
                x[upshift + idx] = x[idx] ;
            }
        }
        return x ;
    }

}
