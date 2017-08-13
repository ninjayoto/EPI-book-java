package com.ryangehring.epi.solutions.c14;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the new interval, you need to find the first and last overlapping.
 * Iterating from earliest interval, add to out UNLESS you overlap.
 *
 *
 * When you encounter an interval with end time >= new interval start,
 * OR start time >= new interval start then (start = new interval start)
 * create
 */
public class P06 {


    public static List<Integer[]> disjointIntervalAddition(Integer[][] data, Integer[] interval) {
        List<Integer[]> out = new ArrayList<Integer[]>();



        Integer lastStart = null ;
        Integer lastEnd = null;

        for (Integer[] x : data) {
            if (lastStart == null) {
                if (x[1] >= interval[0]) {
                    lastStart = x[0];
                } else if (x[0] >= interval[0]) {
                    lastStart = interval[0];
                }
            }
            if ( ((lastStart != null) & (lastEnd == null) ) || (lastEnd >= x[0])  ) {
                if (x[0] <= interval[1]) {
                    lastEnd = interval[1] ;
                }
                if (x[1] > interval[1]) {
                    lastEnd = x[1] ;
                }
            }
            if ((lastStart == null ) || (lastEnd < x[0]) ) {
                out.add(x);
            }

        }
        out.add(new Integer[] {lastStart, lastEnd});

        return out ;
    }

}
