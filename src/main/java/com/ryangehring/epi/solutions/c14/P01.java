package com.ryangehring.epi.solutions.c14;

/**
 * Find the intersection of two arrays
 */
public class P01 {

    public static Integer[] calcIntersection(Integer[] a , Integer[] b) {
        int i=0 ;
        int j=0;
        Integer[] out = new Integer[a.length] ;
        int writeIdx = 0 ;
        while ( (i< a.length) && (j < b.length) ) {
            if (a[i] > b[j] ) {
                j++ ;
            } else if (a[i] == b[j]) {
                out[writeIdx] = a[i] ;
                writeIdx++;
                i++;
                j++;
            } else {
                i++ ;
            }
        }
        return out ;
    }
}
