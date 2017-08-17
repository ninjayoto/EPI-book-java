package com.ryangehring.epi.solutions.c16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Not perfect --- picked a bad recurrence relation.
 * This leads to duplicate printing of elements.
 * The smarter approach --- use a bitarray. keep adding 1 until you get 2^n.
 * And it with the input set and print. These are all power sets.
 *
 */
public class P05 {

    public static void recursivePowerSet(Integer[] x, Set<Integer> out,  int left) {
        if (left==0) {
            System.out.println( Arrays.toString(out.toArray()) );
            return;
        }
        for (Integer xi : x) {
            if (out.contains(xi)) continue ;
            Set<Integer> newOut = new HashSet<Integer>(out) ;
            newOut.add(xi);
            recursivePowerSet(x, newOut, left-1);
        }

    }

    public static void printPowerSet(Integer[] x) {
        for (int i=0; i<=x.length; i++) {
            recursivePowerSet(x, new HashSet<Integer>(), i);
        }
    }

}
