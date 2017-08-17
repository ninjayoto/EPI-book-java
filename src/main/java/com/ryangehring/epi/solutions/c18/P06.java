package com.ryangehring.epi.solutions.c18;

/**
 * 3-Creation Array
 * Maintain the invariant that A[i] <= A[i+1]
 * (by sorting the array)
 * then for any A[i] if 3A[i] > t, you can terminate
 * An n^2 algorithm would be,
 * take t - A[i], then test if A[i through end] 2-creates the value.
 * You only need n iterations to test if it 2-creates it.
 */
public class P06 {

    public static Boolean kCreates(int[] data, int t) {

        for (int i=0; i<data.length; i++) {
            int k=data.length-1 ;
            if (3*data[i] > t) return false;
            int target = t-data[i];


            for (int j=i; j<=k; j++) {
                if (data[j] + data[k] == target ) {return true;}
                if (data[j] + data[k] > target) {
                    k=k-1 ;
                    continue;
                }
                if (data[i] + data[j] < target) {
                    k=data.length-1 ;
                    continue;
                }

            }
        }
        return false;

    }

}
