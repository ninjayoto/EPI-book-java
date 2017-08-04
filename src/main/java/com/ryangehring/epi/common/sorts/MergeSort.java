package com.ryangehring.epi.common.sorts;

import java.util.Arrays;

/**
 * Created by ryan on 8/3/17.
 */
public class MergeSort {


    /**
     * Takes two regions on the array assumed to be sorted
     * and reorders the elements so they are sorted over both regions.
     */
    private static void merge(Comparable[] x, int left1, int right1, int left2, int right2) {
        if (left1 == right1) return ;
        if (left2 == right2) return ;

        int i=left1 ;
        int j=left2 ;

        Comparable[] temp = new Comparable[right2-left1] ;

        int placed = 0 ;
        while ((i < right1) || (j < right2) ) {
            if (i >= right1) {
                temp[placed] = x[j] ;
                j++ ;
            } else if (j >= right2) {
                temp[placed] = x[i] ;
                i++ ;
            }
            else if (x[i].compareTo(x[j]) > 0) {
                temp[placed] = x[j] ;
                j++ ;
            } else {
                temp[placed] = x[i] ;
                i++ ;
            }
            placed++ ;
        }
        for (i=0; i< placed; i++) {
            x[left1 + i] = temp[i] ;
        }
    }

    private static void mergeSortRecursion(Comparable[] x, int start, int end) {
        int mid = (end + start ) / 2 ;
        if (end - start <= 1) return ;

        mergeSortRecursion(x, start, mid);
        mergeSortRecursion(x, mid, end);
        System.out.println("" + start + " " + mid + " "+ end) ;
        System.out.println(Arrays.toString(x)) ;

        merge(x, start, mid, mid, end) ;

    }

    public static void mergeSort(Comparable[] x) {
        mergeSortRecursion(x, 0, x.length);
    }



}
