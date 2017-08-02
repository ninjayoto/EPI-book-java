package com.ryangehring.epi.solutions.c11;

import com.ryangehring.epi.common.Heap;

import java.util.Arrays;

/**
 * In this problem an array alternatingle increases and decreases monotonically
 * k times (k=4) means increasing - decreasing - inscreasing - decrseasing.
 *
 * The problem is to sort this array.
 * Create a heap of size k.
 * iterate over the array until the indices of sign change are found. (could binary search).
 * Then push each min element into a heap.
 * This is O(n) to find the sign changes, and  O(nlog(k)) to sort.
 * But this beats most sorting algorithms which are nlogn .
 */
public class P02 {
    public static Integer[] sortKIncreasingDecreasingArray(Integer[] x, int k) {
        Integer[] out = new Integer[x.length] ;

        // put the changepoints in an array
        Integer[] searchIndices = new Integer[k+1];
        boolean lastIncreasing = true ;
        boolean increasing = true;
        int changePoints  = 1 ;
        searchIndices[0] = 0 ;
        for (int i=1; i<x.length; i++) {

            if (x[i] - x[i-1] >= 0) {
               increasing = true ;
            } else increasing = false ;
            if ((lastIncreasing ^ increasing)) {
                searchIndices[changePoints] = i ;
                changePoints++ ;
            }
            lastIncreasing = increasing ;
        }
        searchIndices[k] = x.length ;

        System.out.println(Arrays.toString(searchIndices ) );
        // reverse the decreasing subarrays
        changePoints  = 0 ;
        for (int i=0;i<k;i++) {
            if (i%2==0) continue ;
            Integer temp ;
            for (int j=0; j< ( (searchIndices[i+1] - 1 - searchIndices[i] )/2 + 1); j++ ) {
                temp = x[ (searchIndices[i] + j) ];
                x[ (searchIndices[i] + j) ] = x[searchIndices[i+1] - j - 1 ] ;
                x[searchIndices[i+1] + j - 1 ] = temp ;
            }
        }

        System.out.println(Arrays.toString(x));

        // pop onto heap to sort
        Heap heap = new Heap() ;
        Integer[] stopIndices = new Integer[k];

        for (int i=0;i<k;i++) {
            stopIndices[i] = searchIndices[i+1];
        }

        for (int i=0;i<k;i++) {
            System.out.println("pushing to heap: " + x[searchIndices[i]]);
            heap.push(x[searchIndices[i]]) ;
        }

        int popped = 0 ;

        while (popped < x.length ) {
            System.out.println("search indices " + Arrays.toString(searchIndices)) ;
            System.out.println("stop indices " + Arrays.toString(stopIndices)) ;
            out[popped] = (Integer) heap.pop() ;
            System.out.println(out[popped]) ;
            for (int j=0; j<k; j++) {
                if (searchIndices[j] + 1 < stopIndices[j]) {
                    if (x[searchIndices[j]].equals( out[popped]) ) {
                        searchIndices[j]++ ;
                        heap.push(x[searchIndices[j]]);
                        break ;
                    }
                }
            }
            popped++ ;


        }


        return out ;
    }
}
