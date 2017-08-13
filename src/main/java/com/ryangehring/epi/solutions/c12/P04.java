package com.ryangehring.epi.solutions.c12;

/**
 * Created by ryan on 8/11/17.
 */
public class P04 {


    public static int searchCyclicalArray(int[] x) {
        if (x.length == 0) return -1 ;
        int start = 0 ;
        int end = x.length -1 ;
        int mid = (start + end) / 2 ;
        while (end - start > 2) {
            //System.out.println("start : "+ start + " mid: "+ mid + " end: "+end);
            if (x[end] > x[start]) {
                end = mid ;
            } else {
                start = mid ;
            }
            mid = (start + end) / 2 ;
        }
        if (x[start] < x[end]) return start ;
        if (x[mid] < x[end]) return mid ;
        return end ;
    }



}
