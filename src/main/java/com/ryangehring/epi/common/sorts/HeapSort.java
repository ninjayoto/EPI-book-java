package com.ryangehring.epi.common.sorts;

import com.ryangehring.epi.common.Heap;

/**
 * Created by ryan on 8/3/17.
 */
public class HeapSort {


    public static void heapSort(Comparable[] x) {
        Heap heap = new Heap() ;
        for (Comparable x_i : x) heap.push(x_i) ;
        Comparable curr = null ;
        int placed = 0 ;
        while (true) {
            curr = heap.pop() ;
            if ((curr) == null) break ;
            x[placed] = curr ;
            placed++ ;
        }
    }

}
