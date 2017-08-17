package com.ryangehring.epi.solutions.c16;

import java.util.*;

/**
 *
 */
public class P06 {


    public static void recursiveSubset(Integer[] x, Set<Integer> out, int left, Set<Set<Integer>> realOut) {
        if (left==0) {
            realOut.add(   out ) ;
            return;
        }
        for (Integer xi : x) {
            if (out.contains(xi)) continue ;
            Set<Integer> newOut = new HashSet<Integer>(out) ;
            newOut.add(xi);
            recursiveSubset(x, newOut, left-1, realOut);
        }
    }

    public static Set<Set<Integer>> subsetOfSizeK(int n, int k) {
        List<Integer[]> out = new ArrayList<Integer[]>() ;
        Integer[] x = new Integer[n];
        for (int i=0; i<n; i++) {
            x[i] = i ;
        }
        Set<Set<Integer>> realOut = new HashSet<Set<Integer>>() ;
        recursiveSubset(x, new HashSet<Integer>(), k, realOut );
        return realOut;
    }


}
