package com.ryangehring.epi.solutions.c12;

/**
 * Created by ryan on 8/1/17.
 */
public class P01 {

    private static int recursiveBinarySearch(Integer[] x, Integer k, int start, int end) {

        if (x[start].equals( k)) return start ;

        if (end-start <= 1) {
            if (x[end].equals(k) ) return end ;
            return -1 ;
        }
        int mid = start + ((end-start) / 2) ;

        if (x[mid] >= k) return recursiveBinarySearch(x, k, start, mid);
        return recursiveBinarySearch(x, k, mid, end);
    }

    public static int firstOccurenceOf(Integer[] x, Integer k) {
        if (x.length==0) return -1 ;
        return recursiveBinarySearch(x, k, 0, x.length-1) ;
    }

}
