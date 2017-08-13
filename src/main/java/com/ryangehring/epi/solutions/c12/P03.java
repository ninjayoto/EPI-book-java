package com.ryangehring.epi.solutions.c12;

/**
 * Algorithm that takes sorted array and finds A[i] = i
 * Array is already sorted so just start at 0 and skip to the
 * greater of the current index + 1 and the value in the curret index.
 *
 *
 */
public class P03 {

    public static Integer findEqualSpot(Integer[] a) {
        int i=0 ;
        while (i < a.length) {
            if (i==a[i]) return i ;
            if (a[i] > (i+1)) {
                i=a[i];
                continue;
            }
            i=i+1 ;
        }
        return -1;
    }


}
