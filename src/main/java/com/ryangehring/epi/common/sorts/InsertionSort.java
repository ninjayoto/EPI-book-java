package com.ryangehring.epi.common.sorts;

import java.util.Arrays;

/**
 * Created by ryan on 8/3/17.
 */
public class InsertionSort {

    public static void insertionSort(Comparable[] x) {
        Comparable temp ;
        for (int i=1; i<x.length; i++) {
            int j=i-1;
            while ((j >= 0)  && (x[j].compareTo(x[j+1])  > 0) ) {
                temp = x[j + 1];
                x[j + 1] = x[j];
                x[j] = temp;
                j= j -1 ;
            }
        }
    }

}
