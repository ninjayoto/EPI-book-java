package com.ryangehring.epi.common.sorts;

/**
 * Created by ryan on 8/3/17.
 */
public class BubbleSort {

    public static void bubbleSort(Comparable[] x) {
        if (x.length == 1) return;
        Comparable temp;
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 1; i < x.length; i++) {
                if (x[i].compareTo(x[i - 1]) < 0) {
                    temp = x[i];
                    x[i] = x[i - 1];
                    x[i - 1] = temp;
                    swaps++;
                }
            }
        }
    }
}
