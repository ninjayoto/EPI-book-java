package com.ryangehring.epi.common.sorts;

/**
 * Created by ryan on 8/3/17.
 */
public class QuickSort {

    private static int choosePivot(Comparable[] x, int start, int end) {
        // naive + bad choice of pivot --- very slow on already sorted arrays.
        return start ;
    }

    private static void recursiveQuickSortStep(Comparable[] x, int start, int end) {
        if ((end - start) <= 0) return ;

        int pivotIdx = choosePivot(x, start, end) ;
        Comparable pivot = x[pivotIdx] ;
        int i= start  ;
        int j = end  ;
        Comparable temp ;
        while (true) {
            if (i >= j) break ;

            while (x[i].compareTo(pivot) < 0 ) {
                i++ ;
            }
            while (x[j].compareTo(pivot) > 0) {
                j = j - 1;
            }
            if ( (x[i].compareTo(pivot) == 0) && (x[j].compareTo(pivot) == 0) ) {
                if ((j - i) <= 1) break ;
                temp = x[i+1] ;
                x[i+1] = x[j] ;
                x[j] = temp ;
                i++;
                continue;
            }
            temp = x[i] ;
            x[i] = x[j] ;
            x[j] = temp ;
        }
        recursiveQuickSortStep(x, start, i);
        recursiveQuickSortStep(x, i+1, end);

    }

    public static void quickSort(Comparable[] x) {
        recursiveQuickSortStep(x, 0, x.length -1);
    }


}
