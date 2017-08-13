package com.ryangehring.epi.solutions.c12;

/**
 * This
 */
public class P05 {

    public static Integer searchArray(Integer[] x, int k) {
        int end = 0 ;
        int start = 0 ;

        Integer out = null ;
        while (true) {
            try {
                if (x[end]==k) return end ;
                if (x[end] < k) {
                    start = end ;
                    end = (end+1)*2 ;
                } else break;
            } catch (ArrayIndexOutOfBoundsException exception) {
                break;
            }
        }
        int mid = (start+end)/2 ;
        while (true) {
            if (x[start] == k) return start ;
            if (x[end] == k) return end ;
            if (x[mid] == k) return mid ;
            if (end - start <= 2) return null ;
            if (x[mid] > k) {
                end = mid ;
            } else {
                start = mid ;
            }
            mid = (start+end)/2 ;
        }
    }

}
