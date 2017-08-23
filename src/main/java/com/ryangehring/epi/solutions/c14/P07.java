package com.ryangehring.epi.solutions.c14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Union of intervals
 *
 * Thought process:
 *   - consider possible invariants
 *     - intervals are sorted by start time
 *     - as you scan intervals from left to right, you keep only the min
 *       start time within an overlapping set of intervals and the max overlapping end time.
 *     - start a new interval when the current max end time doesnt overlap the next start time.
 *
 *  - Invariant Seems fine.
 *  - So, Complexity analysis:
 *    -CPU : O(nlogn) to sort, O(n) to scan
 *    -Memory : O(1)
 *
 */
public class P07 {

    public static List<Integer[]> mergeIntervals(List<Integer[]> x) {
        Collections.sort(x, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        List<Integer[]> out = new ArrayList() ;
        Integer start = null ;
        Integer end = null ;
        Integer[] lastAdded ={null,null} ;
        for (Integer[] interval : x) {
            if (start == null) {
                start = interval[0];
                end = interval[1];
                continue;
            }
            if (interval[0] < end) {
                if (interval[1] > end) {
                    end = interval[1] ;
                }
            } else {
                lastAdded[0] = start;
                lastAdded[1] = end ;
                out.add(new Integer[] {start, end});
                start = interval[0] ;
                end = interval[1] ;
            }
        }
        if (!lastAdded[0].equals( start ) ) {
            out.add(new Integer[] {start, end});
        }
        return out ;
    }


}
