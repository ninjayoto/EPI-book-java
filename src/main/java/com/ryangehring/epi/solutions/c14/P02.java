package com.ryangehring.epi.solutions.c14;

/**
 * In this one, merge sort in place. Since you are writing data to
 * an array and don't want to handle overwriting data before you read it,
 * write from the right end.
 */
public class P02 {

    public static void mergeSortInPlace(Integer[] a, Integer[] b ) {

        int i=0 ;
        int j= 0 ;

        while ((i<(a.length - b.length) ) && (j < b.length) ) {
            if (a[a.length - b.length - i - 1] <= b[b.length - j - 1]) {
                a[a.length - i - j -1] = b[b.length - j - 1] ;
                j++;
            } else {
                a[a.length - i - j -1] = a[a.length - b.length - i - 1] ;
                i++ ;
            }
        }
    }

}
