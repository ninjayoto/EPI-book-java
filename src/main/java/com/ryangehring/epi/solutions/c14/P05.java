package com.ryangehring.epi.solutions.c14;

import com.ryangehring.epi.common.sorts.QuickSort;

/**
 * Maximum concurrent events
 *
 * Trying to do this in O(n)
 * Imagine sorting each event by start time,
 * and maintaining a separate sorted list by end time.
 * You could iterate in lock step.
 * If the next end time occurs before the next start time,
 * subtract 1 from the current concurrents.
 * Otherwise, add 1.
 * Keep a running champ (max).
 *
 */
public class P05 {
    public static Integer maxConcurrent(Integer[] startTimes, Integer[] endTimes) {
        QuickSort.quickSort(startTimes);
        QuickSort.quickSort(endTimes);
        int i=0;
        int j=0 ;
        int champ = 0 ;
        int curr = 0;
        while ((i < startTimes.length) && (j < endTimes.length)) {
            if (startTimes[i] < endTimes[j]) {
                i++;
                curr++;
            } else {
                j++;
                curr--;
            }
            if (curr > champ) champ=curr ;
        }
        return champ;
    }

}
